package com.kotlinpluralize.rules

object SingularRules {
    val data = listOf(
        Regex("s\$", RegexOption.IGNORE_CASE) to "",
        Regex("(ss)\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("(wi|kni|(?:after|half|high|low|mid|non|night|[^\\w]|^)li)ves\$", RegexOption.IGNORE_CASE) to "\$1fe",
        Regex("(ar|(?:wo|[ae])l|[eo][ao])ves\$", RegexOption.IGNORE_CASE) to "\$1f",
        Regex("ies\$", RegexOption.IGNORE_CASE) to "y",
        Regex("\\b([pl]|zomb|(?:neck|cross)?t|coll|faer|food|gen|goon|group|lass|talk|goal|cut)ies\$", RegexOption.IGNORE_CASE) to "\$1ie",
        Regex("\\b(mon|smil)ies\$", RegexOption.IGNORE_CASE) to "\$1ey",
        Regex("\\b((?:tit)?m|l)ice\$", RegexOption.IGNORE_CASE) to "\$1ouse",
        Regex("(seraph|cherub)im\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("(x|ch|ss|sh|zz|tto|go|cho|alias|[^aou]us|t[lm]as|gas|(?:her|at|gr)o|[aeiou]ris)(?:es)?\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("(analy|diagno|parenthe|progno|synop|the|empha|cri|ne)(?:sis|ses)\$", RegexOption.IGNORE_CASE) to "\$1sis",
        Regex("(movie|twelve|abuse|e[mn]u)s\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("(test)(?:is|es)\$", RegexOption.IGNORE_CASE) to "\$1is",
        Regex("(alumn|syllab|vir|radi|nucle|fung|cact|stimul|termin|bacill|foc|uter|loc|strat)(?:us|i)\$", RegexOption.IGNORE_CASE) to "\$1us",
        Regex("(agend|addend|millenni|dat|extrem|bacteri|desiderat|strat|candelabr|errat|ov|symposi|curricul|quor)a\$", RegexOption.IGNORE_CASE) to "\$1um",
        Regex("(apheli|hyperbat|periheli|asyndet|noumen|phenomen|criteri|organ|prolegomen|hedr|automat)a\$", RegexOption.IGNORE_CASE) to "\$1on",
        Regex("(alumn|alg|vertebr)ae\$", RegexOption.IGNORE_CASE) to "\$1a",
        Regex("(cod|mur|sil|vert|ind)ices\$", RegexOption.IGNORE_CASE) to "\$1ex",
        Regex("(matr|append)ices\$", RegexOption.IGNORE_CASE) to "\$1ix",
        Regex("(pe)(rson|ople)\$", RegexOption.IGNORE_CASE) to "\$1rson",
        Regex("(child)ren\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("(eau)x?\$", RegexOption.IGNORE_CASE) to "\$1",
        Regex("men\$", RegexOption.IGNORE_CASE) to "man"
    )
}