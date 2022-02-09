package io.github.gmvalentino8.data.models

import kotlinx.serialization.Serializable

@Serializable
data class UserApiResponseModel(
    val info: UserApiInfoModel,
    val results: List<UserModel>,
)

@Serializable
data class UserApiInfoModel(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String,
)

@Serializable
data class UserModel(
    val cell: String,
    val dob: DobModel,
    val email: String,
    val gender: String,
    val id: IdModel,
    val location: LocationModel,
    val login: LoginModel,
    val name: NameModel,
    val nat: String,
    val phone: String,
    val picture: PictureModel,
    val registered: RegisteredModel,
)

@Serializable
data class DobModel(
    val age: Int,
    val date: String,
)

@Serializable
data class IdModel(
    val name: String,
    val value: String,
)

@Serializable
data class LocationModel(
    val city: String,
    val coordinates: CoordinatesModel,
    val postcode: String,
    val state: String,
    val street: StreetModel,
    val timezone: TimezoneModel,
)

@Serializable
data class StreetModel(
    val number: Int,
    val name: String
)

@Serializable
data class LoginModel(
    val md5: String,
    val password: String,
    val salt: String,
    val sha1: String,
    val sha256: String,
    val username: String,
    val uuid: String,
)

@Serializable
data class NameModel(
    val first: String,
    val last: String,
    val title: String,
)

@Serializable
data class PictureModel(
    val large: String,
    val medium: String,
    val thumbnail: String,
)

@Serializable
data class RegisteredModel(
    val age: Int,
    val date: String,
)

@Serializable
data class CoordinatesModel(
    val latitude: String,
    val longitude: String,
)

@Serializable
data class TimezoneModel(
    val description: String,
    val offset: String,
)
