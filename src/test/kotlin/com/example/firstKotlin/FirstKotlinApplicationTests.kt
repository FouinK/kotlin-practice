package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val name = "윤성현"

		val trimIndent = """
			${name}
			나이는
			몇살 ?
		""".trimIndent()

		println("trimIndent = ${trimIndent}")

	}

	 class Person {
		 var name: String

		 constructor(name: String) {
			 this.name = name
		 }
	 }
}
