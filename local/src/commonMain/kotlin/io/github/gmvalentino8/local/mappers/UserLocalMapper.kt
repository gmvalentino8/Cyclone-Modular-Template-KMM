package io.github.gmvalentino8.local.mappers

import io.github.gmvalentino8.data.models.UserModel
import io.github.gmvalentino8.data.models.CoordinatesModel
import io.github.gmvalentino8.data.models.DobModel
import io.github.gmvalentino8.data.models.IdModel
import io.github.gmvalentino8.data.models.LocationModel
import io.github.gmvalentino8.data.models.LoginModel
import io.github.gmvalentino8.data.models.NameModel
import io.github.gmvalentino8.data.models.PictureModel
import io.github.gmvalentino8.data.models.RegisteredModel
import io.github.gmvalentino8.data.models.StreetModel
import io.github.gmvalentino8.data.models.TimezoneModel
import io.github.gmvalentino8.local.db.UserDbModel

internal object UserLocalMapper {
    fun modelToDb(model: UserModel): UserDbModel = UserDbModel(
        cell = model.cell,
        dob_age = model.dob.age.toLong(),
        dob_date = model.dob.date,
        email = model.email,
        gender = model.gender,
        id_name = model.id.name,
        id_value = model.id.value,
        location_city = model.location.city,
        location_coordinates_latitude = model.location.coordinates.latitude,
        location_coordinates_longitude = model.location.coordinates.longitude,
        location_postcode = model.location.postcode,
        location_state = model.location.state,
        location_street_number = model.location.street.number.toLong(),
        location_street_name = model.location.street.name,
        location_timezone_description = model.location.timezone.description,
        location_timezone_offset = model.location.timezone.offset,
        login_md5 = model.login.md5,
        login_password = model.login.password,
        login_salt = model.login.salt,
        login_sha1 = model.login.sha1,
        login_sha256 = model.login.sha256,
        login_username = model.login.username,
        login_uuid = model.login.uuid,
        name_first = model.name.first,
        name_last = model.name.last,
        name_title = model.name.title,
        nat = model.nat,
        phone = model.phone,
        picture_large = model.picture.large,
        picture_medium = model.picture.medium,
        picture_thumbnail = model.picture.thumbnail,
        registered_age = model.registered.age.toLong(),
        registered_date = model.registered.date
    )

    fun dbToModel(db: UserDbModel): UserModel = UserModel(
        cell = db.cell,
        dob = DobModel(age = db.dob_age.toInt(), date = db.dob_date),
        email = db.email,
        gender = db.gender,
        id = IdModel(name = db.id_name, value = db.id_value),
        location = LocationModel(
            city = db.location_city,
            coordinates = CoordinatesModel(
                latitude = db.location_coordinates_latitude,
                longitude = db.location_coordinates_longitude
            ),
            postcode = db.location_postcode,
            state = db.location_state,
            street = StreetModel(db.location_street_number.toInt(), db.location_street_name),
            timezone = TimezoneModel(description = db.location_timezone_description, offset = db.location_timezone_offset)
        ),
        login = LoginModel(
            md5 = db.login_md5,
            password = db.login_password,
            salt = db.login_salt,
            sha1 = db.login_sha1,
            sha256 = db.login_sha256,
            username = db.login_username,
            uuid = db.login_uuid
        ),
        name = NameModel(first = db.name_first, last = db.name_last, title = db.name_title),
        nat = db.nat,
        phone = db.phone,
        picture = PictureModel(large = db.picture_large, medium = db.picture_medium, thumbnail = db.picture_thumbnail),
        registered = RegisteredModel(age = db.registered_age.toInt(), date = db.registered_date)
    )
}
