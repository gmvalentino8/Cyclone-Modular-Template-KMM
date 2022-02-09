package io.github.gmvalentino8.application

sealed class BuildType {
    object Stub : BuildType()
    data class Mock(val host: String) : BuildType()
    object Dev : BuildType()
    object Prod : BuildType()
}
