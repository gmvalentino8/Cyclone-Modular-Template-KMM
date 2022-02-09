package io.github.gmvalentino8.domain.core

import io.github.gmvalentino8.domain.core.DomainError

fun interface ErrorHandler {
    fun handleError(throwable: Throwable): DomainError
}
