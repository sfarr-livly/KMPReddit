package com.livly.multiplatform

import android.app.Application
import com.livly.multiplatform.libs.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class RedditApplication : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()
        
        initKoin()
    }
    
    private fun initKoin() {
        startKoin {
            androidContext(this@RedditApplication)
            modules(appModule())
        }
    }
}