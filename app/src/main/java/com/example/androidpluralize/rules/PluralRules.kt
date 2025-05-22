package com.example.androidpluralize.rules

object PluralRules {
    val data = listOf(
        Regex("s?\$", RegexOption.IGNORE_CASE) to "s",
        Regex("[^\\u0000-\\u007F]\$", RegexOption.IGNORE_CASE) to "\$0",
        Regex("([^aeiou]ese)\$", RegexOption.IGNORE_CASE) to "\$0",
        Regex("(ax|test)is\$", RegexOption.IGNORE_CASE) to "\$1es",
        Regex("(alias|[^aou]us|t[lm]as|gas|ris)\$", RegexOption.IGNORE_CASE) to "\$1es",
        Regex("(e[mn]u)s?\$", RegexOption.IGNORE_CASE) to "\$1s",
        Regex("([^l]ias|[aeiou]las|[ejzr]as|[iu]am)\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("(alumn|syllab|vir|radi|nucle|fung|cact|stimul|termin|bacill|foc|uter|loc|strat)(?:us|i)\$", RegexOption.IGNORE_CASE) to "\$1i",
        Regex("(alumn|alg|vertebr)(?:a|ae)\$", RegexOption.IGNORE_CASE) to "\$1ae",
        Regex("(seraph|cherub)(?:im)?\$", RegexOption.IGNORE_CASE) to "\$1im",
        Regex("(her|at|gr)o\$", RegexOption.IGNORE_CASE) to "\$1oes",
        Regex("(agend|addend|millenni|dat|extrem|bacteri|desiderat|strat|candelabr|errat|ov|symposi|curricul|automat|quor)(?:a|um)\$", RegexOption.IGNORE_CASE) to "\$1a",
        Regex("(apheli|hyperbat|periheli|asyndet|noumen|phenomen|criteri|organ|prolegomen|hedr|automat)(?:a|on)\$", RegexOption.IGNORE_CASE) to "\$1a",
        Regex("sis\$", RegexOption.IGNORE_CASE) to "ses",
        Regex("((kni|wi|li)fe)\$", RegexOption.IGNORE_CASE) to "\$1ves",
        Regex("(ar|l|ea|eo|oa|hoo)f\$", RegexOption.IGNORE_CASE) to "\$1ves",
        Regex("([^aeiouy]|qu)y\$", RegexOption.IGNORE_CASE) to "\$1ies",
        Regex("([^ch][ieo][ln])ey\$", RegexOption.IGNORE_CASE) to "\$1ies",
        Regex("(x|ch|ss|sh|zz)\$", RegexOption.IGNORE_CASE) to "\$1es",
        Regex("(matr|cod|mur|sil|vert|ind|append)(?:ix|ex)\$", RegexOption.IGNORE_CASE) to "\$1ices",
        Regex("\\b((?:tit)?m|l)(?:ice|ouse)\$", RegexOption.IGNORE_CASE) to "\$1ice",
        Regex("(child)(?:ren)?\$", RegexOption.IGNORE_CASE) to "\$1ren",
        Regex("eaux\$", RegexOption.IGNORE_CASE) to "\$0",
        Regex("m[ae]n\$", RegexOption.IGNORE_CASE) to "men",
        Regex("^thou\$") to "you"
    )
}