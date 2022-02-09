package io.github.gmvalentino8.application

import android.content.Context
import android.os.Build.MANUFACTURER
import android.os.Build.MODEL
import android.os.Build.VERSION

actual class AppPlatform(
    val context: Context,
) : Platform {
    actual override val osName: String = "android"
    actual override val osVersion: String = VERSION.RELEASE
    actual override val device: String = "$MANUFACTURER $MODEL"
}
