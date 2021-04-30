package com.example.kotlinprogramming.koin

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SampleViewModel() }
}

