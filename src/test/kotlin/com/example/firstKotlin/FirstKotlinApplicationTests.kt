package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val str = "ABC"

		println(str.lastChar())
	}


	fun String.lastChar(): Char {
		return this[this.length - 1]
	}
}
