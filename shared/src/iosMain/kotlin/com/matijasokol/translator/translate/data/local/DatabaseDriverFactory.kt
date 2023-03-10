package com.matijasokol.translator.translate.data.local

import com.matijasokol.translator.database.TranslateDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {

    actual fun create(): SqlDriver {
        return NativeSqliteDriver(
            schema = TranslateDatabase.Schema,
            name = "translate.db"
        )
    }
}