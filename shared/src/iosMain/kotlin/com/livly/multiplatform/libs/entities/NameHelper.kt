package com.livly.multiplatform.libs.entities

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class NameHelper : KoinComponent {
    val name by inject<UserName>()
}