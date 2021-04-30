package com.example.kotlinprogramming.koin

class AA {
    fun name() : String = "AA"
}

class BB(aa: AA) {
    fun name() : String = "BB"
}