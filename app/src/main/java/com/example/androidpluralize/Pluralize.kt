package com.example.androidpluralize

import com.example.androidpluralize.rules.*
import com.example.androidpluralize.utils.PluralizeUtils

object Pluralize {
    private val pluralRules = mutableListOf<Pair<Regex, String>>()
    private val singularRules = mutableListOf<Pair<Regex, String>>()
    private val uncountables = mutableListOf<Any>() // Can be String or Regex
    private val irregularSingles = mutableMapOf<String, String>()
    private val irregularPlurals = mutableMapOf<String, String>()

    init {
        initIrregularRules()
        initPluralRules()
        initSingularRules()
        initUncountableRules()
    }

    private fun initIrregularRules() {
        for ((single, plural) in IrregularRules.data) {
            irregularSingles[single.lowercase()] = plural.lowercase()
            irregularPlurals[plural.lowercase()] = single.lowercase()
        }
    }

    private fun initPluralRules() {
        pluralRules.addAll(PluralRules.data)
    }

    private fun initSingularRules() {
        singularRules.addAll(SingularRules.data)
    }

    private fun initUncountableRules() {
        uncountables.addAll(UncountableRules.data)
    }

    private fun isUncountable(word: String): Boolean {
        val lower = word.lowercase()
        return uncountables.any {
            when (it) {
                is String -> it.lowercase() == lower
                is Regex -> it.matches(lower)
                else -> false
            }
        }
    }

    private fun sanitizeWord(token: String, word: String, rules: List<Pair<Regex, String>>): String {
        if (token.isEmpty() || isUncountable(token)) return word
        for ((regex, replacement) in rules.reversed()) {
            if (regex.containsMatchIn(word)) {
                return PluralizeUtils.replace(word, regex, replacement)
            }
        }
        return word
    }

    private fun replaceWord(
        replaceMap: Map<String, String>,
        keepMap: Map<String, String>,
        rules: List<Pair<Regex, String>>,
        word: String
    ): String {
        val token = word.lowercase()

        if (keepMap.containsKey(token)) {
            return PluralizeUtils.restoreCase(word, token)
        }

        if (replaceMap.containsKey(token)) {
            return PluralizeUtils.restoreCase(word, replaceMap[token]!!)
        }

        return sanitizeWord(token, word, rules)
    }

    private fun checkWord(
        replaceMap: Map<String, String>,
        keepMap: Map<String, String>,
        rules: List<Pair<Regex, String>>,
        word: String
    ): Boolean {
        val token = word.lowercase()

        if (keepMap.containsKey(token)) return true
        if (replaceMap.containsKey(token)) return false

        return sanitizeWord(token, token, rules) == token
    }

    fun plural(word: String): String =
        replaceWord(irregularSingles, irregularPlurals, pluralRules, word)

    fun singular(word: String): String =
        replaceWord(irregularPlurals, irregularSingles, singularRules, word)

    fun isPlural(word: String): Boolean =
        checkWord(irregularSingles, irregularPlurals, pluralRules, word)

    fun isSingular(word: String): Boolean =
        checkWord(irregularPlurals, irregularSingles, singularRules, word)

    fun pluralize(word: String, count: Int, inclusive: Boolean = false): String {
        val result = if (count == 1) singular(word) else plural(word)
        return if (inclusive) "$count $result" else result
    }
}