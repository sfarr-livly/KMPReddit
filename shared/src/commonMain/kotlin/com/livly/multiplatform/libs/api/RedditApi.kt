package com.livly.multiplatform.libs.api

import com.livly.multiplatform.libs.entities.Feed
import io.ktor.client.call.*
import io.ktor.client.request.*

class RedditApi : BaseApi() {
    suspend fun getAll(): Feed {
        val response: Feed = client.get("https://reddit.com/r/all.json").body()
        return response
    }
}