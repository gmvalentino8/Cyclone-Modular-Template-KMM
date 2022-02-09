package io.github.gmvalentino8.domain.core

// TODO: Reconsider Name & Package
sealed class DomainResult<out R> {
    data class Success<out T>(val data: T) : DomainResult<T>()
    data class Failure(val error: DomainError) : DomainResult<Nothing>()
}

fun <T> Result<T>.toDomainResult(errorHandler: ErrorHandler) = this.fold(
    onSuccess = { DomainResult.Success(it) },
    onFailure = { DomainResult.Failure(errorHandler.handleError(it)) }
)
