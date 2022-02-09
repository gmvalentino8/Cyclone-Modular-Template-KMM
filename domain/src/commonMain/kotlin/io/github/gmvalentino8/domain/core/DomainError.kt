package io.github.gmvalentino8.domain.core

// TODO: Reconsider Name & Package
sealed class DomainError(
    open val throwable: Throwable,
) : Throwable(throwable) {
    data class Network(override val throwable: Throwable) : DomainError(throwable)
    data class NotFound(override val throwable: Throwable) : DomainError(throwable)
    data class Unauthorized(override val throwable: Throwable) : DomainError(throwable)
    data class Forbidden(override val throwable: Throwable) : DomainError(throwable)
    data class RequestTimeout(override val throwable: Throwable) : DomainError(throwable)
    data class UpgradeRequired(override val throwable: Throwable) : DomainError(throwable)
    data class Internal(override val throwable: Throwable) : DomainError(throwable)
    data class Unavailable(override val throwable: Throwable) : DomainError(throwable)
    data class BadRequest(override val throwable: Throwable) : DomainError(throwable)
    data class Unknown(override val throwable: Throwable) : DomainError(throwable)
}
