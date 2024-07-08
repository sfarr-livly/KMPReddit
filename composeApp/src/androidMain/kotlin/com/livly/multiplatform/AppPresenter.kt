package com.livly.multiplatform

import com.livly.multiplatform.libs.entities.UserName
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class AppPresenter : KoinComponent {
    val name: UserName by inject()
}