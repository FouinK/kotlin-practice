package com.example.firstKotlin.calzz

open class Base (
    open val number:Int = 300
) {
    init {
        println("초기화 블록")
        println(number)
    }
}