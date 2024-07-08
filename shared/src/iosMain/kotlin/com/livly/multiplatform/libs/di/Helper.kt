package com.livly.multiplatform.libs.di

import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(module)
    }
}