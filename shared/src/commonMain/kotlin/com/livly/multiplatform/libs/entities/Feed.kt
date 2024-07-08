package com.livly.multiplatform.libs.entities

import kotlinx.serialization.Serializable

@Serializable
data class Feed(
    val data: Data
)

@Serializable
data class Data(
    val children: Children 
)

@Serializable
data class Children(
    val data: List<Post>
)