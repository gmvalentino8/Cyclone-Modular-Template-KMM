package io.github.gmvalentino8.data.datasources

import io.github.gmvalentino8.data.models.UserModel

interface SampleRemoteDataSource {
    suspend fun getUsers(): List<UserModel>
}
