package com.example.kotlinprogramming.fastcampus

fun main() {
    val tv = TV(listOf("K", "M", "S"))
    tv.channelUp()
    tv.channelUp()
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    println(tv.onOff)
}

class TV(val channel: List<String>) {
    var onOff: Boolean = false // True -> On, False -> Off
    var currentChannelNumber = 0
        set(value) {
            field = value
            if(field > 2){
                field = 0
            }
            if(field < 0){
                field = 2
            }
        }

    fun switch() {
    onOff = !onOff
    }

    fun checkCurrentChannel(): String {
        return channel[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber = currentChannelNumber + 1
//        channel.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber = currentChannelNumber + 1
//                return
//            }
//        }
    }

    fun channelDown() {
        currentChannelNumber = currentChannelNumber - 1
//        channel.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                return
//            }
//        }
    }
}