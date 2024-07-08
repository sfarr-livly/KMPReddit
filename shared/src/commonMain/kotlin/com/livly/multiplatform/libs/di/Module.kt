package com.livly.multiplatform.libs.di

import com.livly.multiplatform.libs.entities.UserName
import com.livly.multiplatform.libs.entities.getName
import org.koin.dsl.module


val module = module {
    single<UserName> { getName() }
}