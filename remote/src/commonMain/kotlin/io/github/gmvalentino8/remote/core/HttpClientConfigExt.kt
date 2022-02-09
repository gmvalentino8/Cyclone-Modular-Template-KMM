package io.github.gmvalentino8.remote.core

import io.github.gmvalentino8.application.Config
import io.ktor.client.HttpClientConfig
import io.ktor.client.features.HttpTimeout
import io.ktor.client.features.defaultRequest
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.client.request.header
import io.ktor.client.request.host
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import kotlinx.serialization.json.Json

// TODO: Use DI?
private val json = Json {
    isLenient = true
    ignoreUnknownKeys = true
    encodeDefaults = false
    useAlternativeNames = false
}

fun HttpClientConfig<*>.installJsonSerializer() = install(JsonFeature) {
    serializer = KotlinxSerializer(json)
    accept(ContentType.Application.Json)
}

fun HttpClientConfig<*>.installTimeOutConfig() = install(HttpTimeout) {
    requestTimeoutMillis = 50000
    connectTimeoutMillis = 50000
    socketTimeoutMillis = 50000
}

fun HttpClientConfig<*>.installDefaultRequest(config: Config) = defaultRequest {
    header(HttpHeaders.ContentType, ContentType.Application.Json.toString())
    header(HttpHeaders.Connection, "close") // to avoid java.io.IOException
    host = config.host
    url { protocol = config.protocol }
}

fun HttpClientConfig<*>.installLogging() {
    install(Logging) {
        level = LogLevel.ALL
        logger = Logger.DEFAULT
    }
}
