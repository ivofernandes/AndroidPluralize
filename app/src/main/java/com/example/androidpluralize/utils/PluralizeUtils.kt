package com.example.androidpluralize.utils

object PluralizeUtils {

    /**
     * Replicates the case of [word] onto [token].
     */
    fun restoreCase(word: String, token: String): String = when {
        word == token -> token
        word == word.lowercase() -> token.lowercase()
        word == word.uppercase() -> token.uppercase()
        word[0].isUpperCase() -> token.replaceFirstChar { it.uppercaseChar() }
        else -> token.lowercase()
    }

    /**
     * Replaces a matched word using a rule.
     *
     * @param word the original word
     * @param regex the regex to match
     * @param replacement a string with interpolation tokens like `$1`
     */
    fun replace(word: String, regex: Regex, replacement: String): String {
        return regex.replace(word) { match ->
            val groupValues = match.groupValues.drop(1)
            val interpolated = interpolate(replacement, groupValues)
            restoreCase(match.value, interpolated)
        }
    }

    /**
     * Interpolates `$1`, `$2` etc. in the replacement string using [args].
     */
    fun interpolate(template: String, args: List<String>): String {
        val regex = Regex("\\$(\\d{1,2})")
        return regex.replace(template) { match ->
            val index = match.groupValues[1].toIntOrNull() ?: return@replace ""
            args.getOrNull(index - 1) ?: ""
        }
    }
}