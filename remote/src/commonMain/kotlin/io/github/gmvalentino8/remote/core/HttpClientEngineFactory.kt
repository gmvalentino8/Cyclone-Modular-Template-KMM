package io.github.gmvalentino8.remote.core

import io.ktor.client.engine.HttpClientEngine

interface HttpClientEngineFactory {
    fun create(): HttpClientEngine
}

expect class DefaultHttpClientEngineFactory : HttpClientEngineFactory
