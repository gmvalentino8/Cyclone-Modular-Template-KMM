package io.github.gmvalentino8.remote.core

import io.ktor.client.engine.ios.Ios

actual class DefaultHttpClientEngineFactory : HttpClientEngineFactory {
    override fun create() = Ios.create()
}
