package com.matijasokol.translator.translate.domain.translate

import com.matijasokol.translator.core.domain.language.Language

interface TranslateClient {

    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String
}