package com.matijasokol.translator.translate.data.local

import com.matijasokol.translator.core.domain.util.CommonFlow
import com.matijasokol.translator.core.domain.util.toCommonFlow
import com.matijasokol.translator.translate.domain.history.HistoryDataSource
import com.matijasokol.translator.translate.domain.history.HistoryItem
import kotlinx.coroutines.flow.MutableStateFlow

class FakeHistoryDataSource : HistoryDataSource {

    private val _data = MutableStateFlow<List<HistoryItem>>(emptyList())

    override fun getHistory(): CommonFlow<List<HistoryItem>> {
        return _data.toCommonFlow()
    }

    override suspend fun insertHistoryItem(item: HistoryItem) {
        _data.value += item
    }
}