package io.github.gmvalentino8.local.core

import android.content.SharedPreferences
import com.russhwolf.settings.AndroidSettings
import com.russhwolf.settings.Settings

actual class DefaultSettingsFactory(
    private val delegate: SharedPreferences,
) : SettingsFactory {
    override fun create(): Settings = AndroidSettings(delegate)
}
