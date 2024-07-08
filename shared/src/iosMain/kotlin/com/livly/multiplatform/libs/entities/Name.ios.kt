package com.livly.multiplatform.libs.entities

data class iOSName(
    override val firstName: String,
    override val lastName: String
): UserName

actual fun getName(): UserName = iOSName(firstName = "iOS-Stephen", lastName = "Farr")