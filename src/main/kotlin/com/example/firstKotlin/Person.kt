package com.example.firstKotlin

import java.lang.IllegalArgumentException

class Person(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫번째 부 생성자")
    }


    constructor() : this("홍길동") {
        println("두번째 부 생성자")
    }

}