package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val numbers = mutableListOf(100, 200)

		numbers.add(300)

		println("numbers[2] = ${numbers[2]}")

		for (number in numbers) {
			println(number)
		}

		for ((idx, value) in numbers.withIndex()) {
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
