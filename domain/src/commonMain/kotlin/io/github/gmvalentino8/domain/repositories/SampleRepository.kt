package io.github.gmvalentino8.domain.repositories

import io.github.gmvalentino8.domain.entities.User

interface SampleRepository {
    suspend fun getUsers(): List<User>
}
