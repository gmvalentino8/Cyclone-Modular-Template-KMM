package io.github.gmvalentino8.remote.apis

import io.github.gmvalentino8.data.models.UserApiResponseModel
import io.github.gmvalentino8.remote.core.HttpClientFactory
import io.ktor.client.request.request

interface SampleApi {
    suspend fun getUsers(): UserApiResponseModel
}

class HttpClientSampleApi(
    httpClientFactory: HttpClientFactory
) : SampleApi {
    internal val httpClient = httpClientFactory.create()

    override suspend fun getUsers(): UserApiResponseModel {
        val path = "/"

        return httpClient.request {
            url { encodedPath = path }
        }
    }
}

