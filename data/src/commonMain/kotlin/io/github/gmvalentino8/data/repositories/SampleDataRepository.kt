package io.github.gmvalentino8.data.repositories

import io.github.gmvalentino8.data.datasources.SampleLocalDataSource
import io.github.gmvalentino8.data.datasources.SampleRemoteDataSource
import io.github.gmvalentino8.data.mappers.UserMapper
import io.github.gmvalentino8.domain.entities.User
import io.github.gmvalentino8.domain.repositories.SampleRepository

class SampleDataRepository(
    private val sampleLocalDataSource: SampleLocalDataSource,
    private val sampleRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {
    override suspend fun getUsers(): List<User> {
        return sampleRemoteDataSource.getUsers().map(UserMapper::modelToEntity)
    }
}
