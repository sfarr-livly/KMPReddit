package com.livly.multiplatform.libs.entities

data class AndroidName(
    override val firstName: String,
    override val lastName: String
): UserName

actual fun getName(): UserName = AndroidName(firstName = "Android-Stephen", lastName = "Farr")