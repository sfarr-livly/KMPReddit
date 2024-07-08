package com.livly.multiplatform.libs.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
data class Post(
    @PrimaryKey val id: String,
    val title: String,
    val thumbnail: String,
)