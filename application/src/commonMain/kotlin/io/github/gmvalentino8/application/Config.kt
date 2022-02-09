package io.github.gmvalentino8.application

interface Config {
    val platform: Platform
    val buildType: BuildType
}

class AppConfig(
    override val platform: AppPlatform,
    override val buildType: BuildType
) : Config
