package io.github.gmvalentino8.local.core

import com.russhwolf.settings.AppleSettings
import com.russhwolf.settings.Settings
import platform.Foundation.NSUserDefaults

actual class DefaultSettingsFactory(
    private val delegate: NSUserDefaults,
) : SettingsFactory {
    override fun create(): Settings = AppleSettings(delegate)
}
