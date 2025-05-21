package com.example.androidpluralize

object Pluralize {
    private val irregular = mapOf(
        "person" to "people",
        "child" to "children",
        "mouse" to "mice"
    )

    fun isPlural(word: String): Boolean {
        return word.endsWith("s") && word.lowercase() !in irregular.values
    }

    fun plural(word: String): String {
        return irregular[word.lowercase()] ?: word + "s"
    }

    fun singular(word: String): String {
        return irregular.entries.find { it.value == word.lowercase() }?.key
            ?: word.removeSuffix("s")
    }
}