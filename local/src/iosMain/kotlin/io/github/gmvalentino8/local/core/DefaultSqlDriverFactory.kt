package io.github.gmvalentino8.local.core

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DefaultSqlDriverFactory : SqlDriverFactory {
    override fun create(schema: SqlDriver.Schema, name: String): SqlDriver = NativeSqliteDriver(
        schema = schema,
        name = name
    )
}
