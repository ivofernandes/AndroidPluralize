package com.example.androidpluralize.rules

object UncountableRules {
    val data = listOf(
        // Common uncountable nouns
        "adulthood", "advice", "agenda", "aid", "aircraft", "alcohol", "ammo",
        "analytics", "anime", "athletics", "audio", "bison", "blood", "bream",
        "buffalo", "butter", "carp", "cash", "chassis", "chess", "clothing", "cod",
        "commerce", "cooperation", "corps", "debris", "diabetes", "digestion", "elk",
        "energy", "equipment", "excretion", "expertise", "firmware", "flounder", "fun",
        "gallows", "garbage", "graffiti", "hardware", "headquarters", "health", "herpes",
        "highjinks", "homework", "housework", "information", "jeans", "justice", "kudos",
        "labour", "literature", "machinery", "mackerel", "mail", "media", "mews", "moose",
        "music", "mud", "manga", "news", "only", "personnel", "pike", "plankton", "pliers",
        "police", "pollution", "premises", "rain", "research", "rice", "salmon", "scissors",
        "series", "sewage", "shambles", "shrimp", "software", "species", "staff", "swine",
        "tennis", "traffic", "transportation", "trout", "tuna", "wealth", "welfare",
        "whiting", "wildebeest", "wildlife", "you",

        // Regex-style entries
        Regex("pok[eé]mon\$", RegexOption.IGNORE_CASE),
        Regex("[^aeiou]ese\$", RegexOption.IGNORE_CASE),
        Regex("deer\$", RegexOption.IGNORE_CASE),
        Regex("fish\$", RegexOption.IGNORE_CASE),
        Regex("measles\$", RegexOption.IGNORE_CASE),
        Regex("o[iu]s\$", RegexOption.IGNORE_CASE),
        Regex("pox\$", RegexOption.IGNORE_CASE),
        Regex("sheep\$", RegexOption.IGNORE_CASE)
    )
}