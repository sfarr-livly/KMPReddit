package com.livly.multiplatform

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.livly.multiplatform.libs.di.appModule
import com.livly.multiplatform.libs.di.module
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initKoin()

        setContent {
            App()
        }
    }
    
    private fun initKoin() {
        startKoin {
            modules(appModule())
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}