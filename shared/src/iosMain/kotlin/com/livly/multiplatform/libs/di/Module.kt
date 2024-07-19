package com.livly.multiplatform.libs.di

import com.livly.multiplatform.libs.database.AppDatabase
import com.livly.multiplatform.libs.database.getDatabaseBuilder
import com.livly.multiplatform.libs.database.getRoomDatabase
import com.livly.multiplatform.libs.viewmodel.FeedViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

private val module = module {
    single<AppDatabase> { getRoomDatabase(getDatabaseBuilder()) }
    singleOf(::FeedViewModel)
}

fun appModule() = listOf(commonModule, module)