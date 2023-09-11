package com.example.firstKotlin

class Penguin(
    spe: String
) : Animal(spe, 2), Swimable, Flyable {

    private val wingCnt: Int = 2
    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCnt: Int
        get() = super.legCnt + this.wingCnt

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}