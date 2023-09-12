package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val numbers = listOf(100, 200)
		val emptyList = emptyList<Int>()

		printNumbers(emptyList())
	}

	private fun printNumbers(numbers: List<Int>) {

	}

	fun printNameAndGender(vararg strings: String) {
		for (string in strings) {
			println(string)
		}
	}

}
