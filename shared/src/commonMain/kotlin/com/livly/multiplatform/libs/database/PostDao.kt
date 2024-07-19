package com.livly.multiplatform.libs.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import com.livly.multiplatform.libs.entities.Post
import kotlinx.coroutines.flow.Flow

@Dao
interface PostDao {
    @Upsert
    suspend fun insert(posts: List<Post>)

    @Query("SELECT * FROM Post")
    fun getAll(): Flow<List<Post>>
}