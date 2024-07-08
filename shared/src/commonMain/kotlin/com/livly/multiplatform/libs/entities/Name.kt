package com.livly.multiplatform.libs.entities

interface UserName {
    val firstName: String
    val lastName: String
}

expect fun getName(): UserName