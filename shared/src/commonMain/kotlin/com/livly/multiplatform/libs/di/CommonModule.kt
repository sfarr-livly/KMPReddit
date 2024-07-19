package com.livly.multiplatform.libs.di

import com.livly.multiplatform.libs.api.RedditApi
import com.livly.multiplatform.libs.database.AppDatabase
import com.livly.multiplatform.libs.database.PostDao
import com.livly.multiplatform.libs.repos.RedditRepository
import com.livly.multiplatform.libs.viewmodel.FeedViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val commonModule = module {
    single<PostDao> { get<AppDatabase>().postDao() }
    singleOf(::RedditApi)
    singleOf(::RedditRepository)
}