package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(repeat("Hello", useNewLine = false))
	}

	fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
		for (i in 1..num) {
			if (useNewLine) {
				println(str)
			} else {
				print(str)
			}
		}
	}

}
