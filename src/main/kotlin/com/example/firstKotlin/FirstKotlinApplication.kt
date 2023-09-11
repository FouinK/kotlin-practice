package com.example.firstKotlin

import com.example.firstKotlin.calzz.Derived
import com.example.firstKotlin.calzz.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinApplication

fun main(args: Array<String>) {
	Derived(300)
	runApplication<FirstKotlinApplication>(*args)
}
