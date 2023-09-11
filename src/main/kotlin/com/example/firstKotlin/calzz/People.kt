package com.example.firstKotlin.calzz

class People (
    var name: String,
    var age: Int,
) {
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): People {
            return People(name, MIN_AGE)
        }
    }
}