package io.github.gmvalentino8.remote.core

import io.ktor.client.engine.android.Android

actual class DefaultHttpClientEngineFactory : HttpClientEngineFactory {
    override fun create() = Android.create()
}
