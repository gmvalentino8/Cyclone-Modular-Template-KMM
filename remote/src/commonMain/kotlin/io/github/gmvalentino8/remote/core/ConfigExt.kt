package io.github.gmvalentino8.remote.core

import io.github.gmvalentino8.application.BuildType
import io.github.gmvalentino8.application.Config
import io.ktor.http.URLProtocol

val Config.host
    get() = when (this.buildType) {
        is BuildType.Stub -> "randomuser.me/api/"
        is BuildType.Mock -> (buildType as BuildType.Mock).host
        is BuildType.Dev -> "randomuser.me/api/"
        is BuildType.Prod -> "randomuser.me/api/"
    }
val Config.protocol
    get() = when (buildType) {
        is BuildType.Stub -> URLProtocol.HTTP
        is BuildType.Mock -> URLProtocol.HTTP
        is BuildType.Dev -> URLProtocol.HTTPS
        is BuildType.Prod -> URLProtocol.HTTPS
    }
