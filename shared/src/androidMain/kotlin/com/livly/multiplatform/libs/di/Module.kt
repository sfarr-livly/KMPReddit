package com.livly.multiplatform.libs.di

import com.livly.multiplatform.libs.database.AppDatabase
import com.livly.multiplatform.libs.database.getDatabaseBuilder
import com.livly.multiplatform.libs.database.getRoomDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

private val module = module {
    single<AppDatabase> { getRoomDatabase(getDatabaseBuilder(androidApplication())) }
}

fun appModule() = listOf(commonModule, module)