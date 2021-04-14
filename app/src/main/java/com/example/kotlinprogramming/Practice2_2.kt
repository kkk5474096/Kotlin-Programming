package com.example.kotlinprogramming

fun main(){
    val account = Account("홍길동", "1990/3/1", 1000)
    println(account.checkMoney())
    println(account.save(1000))
    println(account.pushMoney(2000))
    println(account.checkMoney())
    println()

    val account2 = Account2("홍길동", "1990/3/1", -2000)
    println(account2.checkMoney())
    println(account2.save(1000))
    println(account2.pushMoney(2000))
    println(account2.checkMoney())
    println()

    val account3 = Account3("홍길동", "1990/3/1")
    println(account3.checkMoney())
    println(account3.save(1000))
    println(account3.pushMoney(2000))
    println(account3.checkMoney())
}

class Account(val name:String, val birth: String, var money: Int) {

    fun checkMoney(): Int{
        return money
    }

    fun pushMoney(amount: Int): Boolean {
        if (money >= amount) {
            money -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int): Int {
        money += amount
        return money
    }

}

class Account2 {
    val name: String
    val birth: String
    var money: Int

    constructor(name: String, birth: String, money: Int){
        this.name = name
        this.birth = birth
        if (money >= 0) this.money = money else this.money = 0
    }

    fun checkMoney(): Int{
        return money
    }

    fun pushMoney(amount: Int): Boolean {
        if (money >= amount) {
            money -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int): Int {
        money += amount
        return money
    }
}

class Account3 {
    val name: String
    val birth: String
    var money: Int

    constructor(name: String, birth: String, money: Int = 1000){
        this.name = name
        this.birth = birth
        if (money >= 0) {
            this.money = money
        } else {
            this.money = 0
        }
    }
    fun checkMoney(): Int{
        return money
    }

    fun pushMoney(amount: Int): Boolean {
        if (money >= amount) {
            money -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int): Int {
        money += amount
        return money
    }
}

//변수앞에 val or var 안적
class Account4(initialMoney: Int) {

    val money: Int = if( initialMoney >= 0) initialMoney else 0

    fun checkMoney(): Int{
        return money
    }
}