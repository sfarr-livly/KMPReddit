package com.livly.multiplatform.libs.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.livly.multiplatform.libs.entities.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase(), DB {
    abstract fun postDao(): PostDao
    
    override fun clearAllTables() {
        super.clearAllTables()
    }
}

fun getRoomDatabase(
    builder: RoomDatabase.Builder<AppDatabase>
): AppDatabase {
    return builder
        .fallbackToDestructiveMigrationOnDowngrade(true)
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}

interface DB {
    fun clearAllTables() {}
}