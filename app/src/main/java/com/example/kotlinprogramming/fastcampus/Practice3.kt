package com.example.kotlinprogramming.fastcampus

fun main() {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130,8)
    monster.attack(night)
    monster.bite(night)


}

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다.

open class Cha(var hp: Int, val power: Int) {
    open fun attack(cha: Cha, power: Int = this.power){
        cha.defense(power)
    }

    open fun defense(damage: Int){
        hp -= damage
        if( hp > 0) {
            println("${javaClass.simpleName}의 현재 체력은 $hp 입니다")
        } else println("사망했습니다")
    }
}


class SuperMonster(hp: Int, power: Int) : Cha(hp, power) {
    fun bite(cha: Cha) {
        super.attack(cha, power + 2)
    }
}

class SuperNight(hp: Int, power: Int) : Cha(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}