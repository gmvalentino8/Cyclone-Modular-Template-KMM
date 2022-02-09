package io.github.gmvalentino8.data.mappers

import io.github.gmvalentino8.data.models.UserModel
import io.github.gmvalentino8.domain.entities.User

object UserMapper {
    fun modelToEntity(user: UserModel): User = User(
        id = user.login.uuid,
        name = "${user.name.first} ${user.name.last}",
        picture = user.picture.medium,
        email = user.email,
        phone = user.phone
    )
}
