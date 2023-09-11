package com.example.firstKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinApplication

fun main(args: Array<String>) {
	val person = Person()

	runApplication<FirstKotlinApplication>(*args)
}
