package com.matijasokol.translator.translate.data.translate

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class TranslatedDto(
    @SerialName(value = "translatedText")
    val translatedText: String
)
