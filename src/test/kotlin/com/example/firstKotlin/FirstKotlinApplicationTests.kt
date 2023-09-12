package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		var emptyList: List<Int?>? = mutableListOf()
		val emptyList2: List<Int?> = mutableListOf()
	}

	private fun printNumbers(numbers: List<Int>) {

	}

	fun printNameAndGender(vararg strings: String) {
		for (string in strings) {
			println(string)
		}
	}

}
