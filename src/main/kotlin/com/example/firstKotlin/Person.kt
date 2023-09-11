package com.example.firstKotlin

import java.lang.IllegalArgumentException

class Person(
    val name: String = "윤성현",
    var age: Int = 1
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    fun isAdult1(): Boolean {
        return this.age >= 20
    }

    val isAdult2: Boolean
        get() = this.age >= 20
}