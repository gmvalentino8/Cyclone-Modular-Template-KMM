package io.github.gmvalentino8.local.core

import com.russhwolf.settings.Settings

fun interface SettingsFactory {
    fun create(): Settings
}

expect class DefaultSettingsFactory : SettingsFactory
