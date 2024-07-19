package com.livly.multiplatform.libs.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.livly.multiplatform.libs.entities.Data
import com.livly.multiplatform.libs.entities.Feed
import com.livly.multiplatform.libs.repos.RedditRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn

open class FeedViewModel(
    private val redditRepository: RedditRepository
): ViewModel() {
    val posts = redditRepository.observeFeed()
    
    suspend fun fetchFeed() = redditRepository.fetchFeed()
}