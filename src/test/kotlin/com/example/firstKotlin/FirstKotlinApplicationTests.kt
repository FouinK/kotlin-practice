package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val set = setOf(100, 100)

		for (i in set) {
			println("${i}")
		}

		for ((idx, value) in set.withIndex()) {
			println("${idx} ${value}")
		}
	}

	private fun printNumbers(numbers: List<Int>) {

	}

	fun printNameAndGender(vararg strings: String) {
		for (string in strings) {
			println(string)
		}
	}

}
