package com.example.kotlinprogramming.koin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class KoinActivity : AppCompatActivity() {

    val sampleViewModel: SampleViewModel by viewModel()

    // inject() 의존성 주입 - Lazy 방식
    val aa_inject1 : AA by inject()	// inject Type 유형 1 - Type by inject()
    val bb_inject2 by inject<BB>()	// inject Type 유형 2 - by inject<Type>()

    // get() 의존성 주입 - 바로 주입 방식
    var aa_get1 : AA = get()		// get Tpye 유형 1 - Type = get()
    var bb_get2 = get<BB>()		// get Type 유형 2 - get<Type>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        println("bb_inject1 name is ${aa_inject1.name()}")
        println("bb_inject2 name is ${bb_inject2.name()}")

        println("bb_get1 name is ${aa_get1.name()}")
        println("bb_get2 name is ${bb_get2.name()}")
    }
}