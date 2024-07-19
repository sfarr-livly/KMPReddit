package com.livly.multiplatform.libs.di

import com.livly.multiplatform.libs.database.AppDatabase
import com.livly.multiplatform.libs.database.getDatabaseBuilder
import com.livly.multiplatform.libs.database.getRoomDatabase
import com.livly.multiplatform.libs.viewmodel.FeedViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

private val module = module {
    single<AppDatabase> { getRoomDatabase(getDatabaseBuilder(androidApplication())) }
    viewModelOf(::FeedViewModel)
}

fun appModule() = listOf(commonModule, module)