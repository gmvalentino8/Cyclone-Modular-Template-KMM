package io.github.gmvalentino8.domain.entities

import io.github.gmvalentino8.utils.Parcelable
import io.github.gmvalentino8.utils.Parcelize

// ref: https://randomuser.me/documentation#intro
@Parcelize
data class User(
    val id: String,
    val name: String,
    val picture: String,
    val email: String,
    val phone: String,
) : Parcelable
