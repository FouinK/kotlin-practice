package com.example.firstKotlin

abstract class Animal (
    protected val spe: String,
    protected open val legCnt: Int
) {
    abstract fun move()
}
