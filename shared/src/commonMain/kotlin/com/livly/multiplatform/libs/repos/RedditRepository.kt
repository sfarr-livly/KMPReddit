package com.livly.multiplatform.libs.repos

import com.livly.multiplatform.libs.api.RedditApi
import com.livly.multiplatform.libs.database.AppDatabase
import com.livly.multiplatform.libs.database.PostDao
import com.livly.multiplatform.libs.entities.Feed

class RedditRepository(
    private val postDao: PostDao,
    private val redditApi: RedditApi
) {
    suspend fun fetchFeed(): Feed {
        val feed = redditApi.getAll()
        postDao.insert(feed.data.children.map { it.data })
        
        return feed
    }
    
    fun observeFeed() = postDao.getAll()
}