package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val person = Person("윤성현", 26)
		val (name, age) = person

		println("name = ${name}")
		println("age = ${age}")

	}

}

data class Person(
	val name: String,
	val age: Int
)