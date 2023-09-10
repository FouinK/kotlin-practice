package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val numbers = listOf(1, 2, 3)
		for (number in numbers) {
			println("number = ${number}")
		}

		for (i in 1..3) {
			println(i)
		}

		for (i in 3 downTo 1) {
			println(i)
		}

		for (i in 1..5 step 2) {
			println(i)
		}
	}

}
