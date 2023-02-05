package com.matijasokol.translator.translate.data.remote

import com.matijasokol.translator.core.domain.language.Language
import com.matijasokol.translator.translate.domain.translate.TranslateClient

class FakeTranslateClient : TranslateClient {

    var translatedText = "test translation"

    override suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String {
        return translatedText
    }
}