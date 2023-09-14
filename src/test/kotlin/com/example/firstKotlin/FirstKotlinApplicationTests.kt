package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val person = Person("윤성현", 26)
//		val (name, age) = person
		val name = person.component1()
		val age = person.component2()

		println("name = ${name}")
		println("age = ${age}")

	}

}

data class Person(
	val name: String ,
	val age: Int
)