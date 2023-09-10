package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(parseIntException("10"))
	}

	fun parseIntException(str: String): Int {
		try {
			return str.toInt()
		} catch (e: NumberFormatException) {
			throw IllegalArgumentException("숫자가 아닙니다")
		}
	}

}
