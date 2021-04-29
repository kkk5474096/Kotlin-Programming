package com.example.kotlinprogramming.fastcampus

fun main() {
    val calculator = Calculator()
    println(calculator.add(4,3))
    println(calculator.sub(4,3))
    println(calculator.mul(4,3))
    println(calculator.division(4,3))

    val calculator2 = Calculator2()
    println(calculator2.add(4,3,2))
    println(calculator2.sub(4,3,3))
    println(calculator2.mul(4,3,2))
    println(calculator2.division(10,2,1))

    val calculator3 = Calculator3(4)
    calculator3.add(8).sub(3)

}

class Calculator() {
    fun add(a: Int, b: Int): Int{
        return a + b
    }
    fun sub(a: Int, b: Int): Int{
        return a - b
    }

    fun mul(a: Int, b: Int): Int{
        return a * b
    }
    fun division(a: Int, b: Int): Int{
        return a / b
    }
}

class Calculator2() {
    fun add(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun sub(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if(i != 0) {
                result -= numbers[i]
            }
        }
        return result
    }

    fun mul(vararg numbers: Int): Int {
        var result = 1
        numbers.forEach {
            result *= it
        }
        return result
    }

    fun division(vararg numbers: Int): Int {
        var result = numbers[0]
        for (i in 0 until numbers.size) {
            if( i != 0) {
                result /= numbers[i]
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int) {

    fun add(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun sub(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun mul(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun division(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }

}