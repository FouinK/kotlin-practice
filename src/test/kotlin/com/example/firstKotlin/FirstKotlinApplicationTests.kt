package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val array = arrayOf(100, 200)

		array.plus(300)

		for ((idx, value) in array.withIndex()) {
			println("${idx} ${value}")
		}

	}

	fun printNameAndGender(vararg strings: String) {
		for (string in strings) {
			println(string)
		}
	}

}
