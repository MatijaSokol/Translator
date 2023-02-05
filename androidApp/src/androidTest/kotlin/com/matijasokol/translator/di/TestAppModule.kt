package com.matijasokol.translator.di

import com.matijasokol.translator.translate.data.local.FakeHistoryDataSource
import com.matijasokol.translator.translate.data.remote.FakeTranslateClient
import com.matijasokol.translator.translate.domain.history.HistoryDataSource
import com.matijasokol.translator.translate.domain.translate.Translate
import com.matijasokol.translator.translate.domain.translate.TranslateClient
import com.matijasokol.translator.voice_to_text.data.FakeVoiceToTextParser
import com.matijasokol.translator.voice_to_text.domain.VoiceToTextParser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    fun provideFakeTranslateClient(): TranslateClient {
        return FakeTranslateClient()
    }

    @Provides
    @Singleton
    fun provideFakeHistoryDataSource(): HistoryDataSource {
        return FakeHistoryDataSource()
    }

    @Provides
    @Singleton
    fun provideTranslateUseCase(
        client: TranslateClient,
        dataSource: HistoryDataSource
    ): Translate {
        return Translate(client, dataSource)
    }

    @Provides
    @Singleton
    fun provideFakeVoiceToTextParser(): VoiceToTextParser {
        return FakeVoiceToTextParser()
    }
}