package com.example.kotlin.injection

import org.koin.core.module.Module
import org.koin.dsl.module

val presentationModule : Module = module {
    factory { MainViewModel() }
}