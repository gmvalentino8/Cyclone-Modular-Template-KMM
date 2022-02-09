package io.github.gmvalentino8.local.core

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import io.github.gmvalentino8.application.AppConfig

actual class DefaultSqlDriverFactory(private val config: AppConfig) : SqlDriverFactory {
    override fun create(schema: SqlDriver.Schema, name: String): SqlDriver = AndroidSqliteDriver(
        schema = schema,
        context = config.platform.context,
        name = name,
    )
}
