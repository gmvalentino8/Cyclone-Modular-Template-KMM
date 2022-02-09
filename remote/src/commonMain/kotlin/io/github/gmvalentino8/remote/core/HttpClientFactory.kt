package io.github.gmvalentino8.remote.core

import io.github.gmvalentino8.application.Config
import io.ktor.client.HttpClient

interface HttpClientFactory {
    fun create(): HttpClient
}

class DefaultHttpClientFactory(
    private val config: Config,
    private val httpClientEngineFactory: HttpClientEngineFactory,
) : HttpClientFactory {
    override fun create() = HttpClient(httpClientEngineFactory.create()) {
        installDefaultRequest(config)
        installJsonSerializer()
        installLogging()
        installTimeOutConfig()
    }
}
