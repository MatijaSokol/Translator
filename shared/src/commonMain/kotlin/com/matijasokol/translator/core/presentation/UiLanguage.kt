package com.matijasokol.translator.core.presentation

import com.matijasokol.translator.core.domain.language.Language

expect class UiLanguage {

    val language: Language

    companion object {
        val allLanguages: List<UiLanguage>
        fun byCode(code: String): UiLanguage
    }
}