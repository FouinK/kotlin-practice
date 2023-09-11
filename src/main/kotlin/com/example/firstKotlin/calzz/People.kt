package com.example.firstKotlin.calzz

import com.example.firstKotlin.interfac.Log

class People (
    var name: String,
    var age: Int,
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): People {
            return People(name, MIN_AGE)
        }

        override fun log() {
            println("나는 people 클래스의 동행객체 Factory예요")
        }
    }
}