package com.example.androidpluralize.rules

object IrregularRules {
    val data = listOf(
        // Pronouns
        "I" to "we",
        "me" to "us",
        "he" to "they",
        "she" to "they",
        "them" to "them",
        "myself" to "ourselves",
        "yourself" to "yourselves",
        "itself" to "themselves",
        "herself" to "themselves",
        "himself" to "themselves",
        "themself" to "themselves",
        "is" to "are",
        "was" to "were",
        "has" to "have",
        "this" to "these",
        "that" to "those",

        // Ends with consonant + o
        "echo" to "echoes",
        "dingo" to "dingoes",
        "volcano" to "volcanoes",
        "tornado" to "tornadoes",
        "torpedo" to "torpedoes",

        // Ends with -us
        "genus" to "genera",
        "viscus" to "viscera",

        // Ends with -ma
        "stigma" to "stigmata",
        "stoma" to "stomata",
        "dogma" to "dogmata",
        "lemma" to "lemmata",
        "schema" to "schemata",
        "anathema" to "anathemata",

        // Other irregulars
        "ox" to "oxen",
        "axe" to "axes",
        "die" to "dice",
        "yes" to "yeses",
        "foot" to "feet",
        "eave" to "eaves",
        "goose" to "geese",
        "tooth" to "teeth",
        "quiz" to "quizzes",
        "human" to "humans",
        "proof" to "proofs",
        "carve" to "carves",
        "valve" to "valves",
        "looey" to "looies",
        "thief" to "thieves",
        "groove" to "grooves",
        "pickaxe" to "pickaxes",
        "passerby" to "passersby",
        "person" to "people"
    )
}