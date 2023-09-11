package com.example.firstKotlin

import java.lang.IllegalArgumentException

class Person(
    val name: String = "윤성현",       //val, var을 붙이면 자동으로 게터 세터를 만들어줌 커스텀 게터 세터를 만들고 싶으면 val, var을 뗄 것
    var age: Int = 1        //val, var을 붙이면 자동으로 게터 세터를 만들어줌 커스텀 게터 세터를 만들고 싶으면 val, var을 뗄 것
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