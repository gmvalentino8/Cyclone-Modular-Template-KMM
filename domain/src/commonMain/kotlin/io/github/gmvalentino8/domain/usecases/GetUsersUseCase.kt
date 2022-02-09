package io.github.gmvalentino8.domain.usecases

import io.github.gmvalentino8.domain.core.DomainResult
import io.github.gmvalentino8.domain.core.ErrorHandler
import io.github.gmvalentino8.domain.core.UseCase
import io.github.gmvalentino8.domain.core.toDomainResult
import io.github.gmvalentino8.domain.entities.User
import io.github.gmvalentino8.domain.repositories.SampleRepository

interface GetUsersUseCase : UseCase<Unit, DomainResult<List<User>>>

class GetUsers(
    private val sampleRepository: SampleRepository,
    private val errorHandler: ErrorHandler,
) : GetUsersUseCase {
    override suspend fun execute(arguments: Unit): DomainResult<List<User>> = runCatching {
        sampleRepository.getUsers()
    }.toDomainResult(errorHandler)
}
