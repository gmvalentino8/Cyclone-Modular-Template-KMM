package io.github.gmvalentino8.local.dataproviders

import io.github.gmvalentino8.data.datasources.SampleLocalDataSource
import io.github.gmvalentino8.data.models.UserModel
import io.github.gmvalentino8.local.core.SettingsFactory
import io.github.gmvalentino8.local.core.SqlDriverFactory
import io.github.gmvalentino8.local.db.UserDatabase
import io.github.gmvalentino8.local.mappers.UserLocalMapper

class SampleLocalDataProvider(
    sqlDriverFactory: SqlDriverFactory,
    settingsFactory: SettingsFactory
) : SampleLocalDataSource {
    internal val userDatabase = UserDatabase(sqlDriverFactory.create(UserDatabase.Schema, "User"))
    internal val settings = settingsFactory.create()

    override suspend fun saveUsers(users: List<UserModel>) {
        userDatabase.usersQueries.transaction {
            users.map(UserLocalMapper::modelToDb).forEach {
                userDatabase.usersQueries.saveOrUpdateUser(it)
            }
        }
    }

    override suspend fun getUser(id: String): UserModel =
        userDatabase.usersQueries.getUser(id).executeAsOne().run(UserLocalMapper::dbToModel)
}
