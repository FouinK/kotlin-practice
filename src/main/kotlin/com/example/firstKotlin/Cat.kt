package com.example.firstKotlin

class Cat (
    spe: String
) : Animal(spe, 4) {
    override fun move() {
        println("고양이가 걸어가")
    }

}