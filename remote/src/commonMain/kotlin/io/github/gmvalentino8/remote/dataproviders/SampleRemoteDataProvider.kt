package io.github.gmvalentino8.remote.dataproviders

import io.github.gmvalentino8.data.datasources.SampleRemoteDataSource
import io.github.gmvalentino8.data.models.UserModel
import io.github.gmvalentino8.remote.apis.SampleApi

class SampleRemoteDataProvider(
    private val sampleApi: SampleApi,
) : SampleRemoteDataSource {
    override suspend fun getUsers(): List<UserModel> = sampleApi.getUsers().results
}
