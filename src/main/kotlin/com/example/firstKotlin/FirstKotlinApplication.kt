package com.example.firstKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinApplication

fun main(args: Array<String>) {
	val person = Person("윤성현")
	println(person.name)
	person.age = 10
	println(person.age)

	runApplication<FirstKotlinApplication>(*args)
}
