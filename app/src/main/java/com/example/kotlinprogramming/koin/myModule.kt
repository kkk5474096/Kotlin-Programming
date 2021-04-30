package com.example.kotlinprogramming.koin

import org.koin.dsl.module

val myModule = module {
    single { AA() }

    factory { BB(get()) }
}