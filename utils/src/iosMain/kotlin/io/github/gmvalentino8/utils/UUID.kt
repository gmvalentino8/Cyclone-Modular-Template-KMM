package io.github.gmvalentino8.utils

import platform.Foundation.NSUUID

actual object UUID {
    actual fun randomUUID(): String {
        return NSUUID.UUID().UUIDString
    }
}
