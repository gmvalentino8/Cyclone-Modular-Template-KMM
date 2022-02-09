package io.github.gmvalentino8.application

interface Platform {
    val osName: String
    val osVersion: String
    val device: String
}

expect class AppPlatform : Platform {
    override val osName: String
    override val osVersion: String
    override val device: String
}
