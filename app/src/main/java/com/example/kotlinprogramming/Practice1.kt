package com.example.kotlinprogramming

fun main(){
    list()
    println(grade(70))
    println(addNumber(57))
    gugudan()
}

fun list(){
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Boolean>()

    for (i in 1 until 10) {
        list1.add(i)
    }
    println(list1)

    for (i in list1) {
        if (i % 2 == 0) {
            list2.add(true)
        } else {
            list2.add(false)
        }
    }
    println(list2)
}

fun grade(score: Int): String {
    when (score) {
        in 80..90 -> return "A"
        in 70..79 -> return "B"
        in 60..69 -> return "C"
        else -> return "F"
    }
}

fun addNumber(number: Int): Int{
    val a = number / 10
    val b = number % 10
    return a + b
}

fun gugudan() {
    for (i in 1 .. 9) {
        for(j in 1.. 9) {
            println("$i X $j = ${i*j}")
        }
    }
}