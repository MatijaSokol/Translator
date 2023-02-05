package com.matijasokol.translator.translate.data.translate

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class TranslateDto(
    @SerialName(value = "q")
    val textToTranslate: String,

    @SerialName(value = "source")
    val sourceLanguageCode: String,

    @SerialName(value = "target")
    val targetLanguageCode: String
)
