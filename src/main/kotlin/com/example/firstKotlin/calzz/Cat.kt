package com.example.firstKotlin.calzz

class Cat (
    spe: String
) : Animal(spe, 4) {
    override fun move() {
        println("고양이가 걸어가")
    }

}