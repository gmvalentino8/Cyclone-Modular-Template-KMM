package io.github.gmvalentino8.data.datasources

import io.github.gmvalentino8.data.models.UserModel

interface SampleLocalDataSource {
    suspend fun saveUsers(users: List<UserModel>)
    suspend fun getUser(id: String): UserModel
}
