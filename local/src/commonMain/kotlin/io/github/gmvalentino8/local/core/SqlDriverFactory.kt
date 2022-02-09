package io.github.gmvalentino8.local.core

import com.squareup.sqldelight.db.SqlDriver

interface SqlDriverFactory {
    fun create(schema: SqlDriver.Schema, name: String): SqlDriver
}

expect class DefaultSqlDriverFactory : SqlDriverFactory
