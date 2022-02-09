package io.github.gmvalentino8.application

import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.stringWithCString
import platform.UIKit.UIDevice
import platform.posix.uname
import platform.posix.utsname

actual class AppPlatform : Platform {
    actual override val osName: String = "ios"
    actual override val osVersion: String = UIDevice.currentDevice.systemVersion
    actual override val device: String = "Apple ${deviceModel()}"
}

private fun deviceModel(): String = memScoped {
    val systemInfo: utsname = alloc()
    uname(systemInfo.ptr)
    NSString.stringWithCString(cString = systemInfo.machine, encoding = NSUTF8StringEncoding)
}.toString()
