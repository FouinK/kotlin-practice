package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {

		val numbers = listOf(1, 2, 3)
		numbers.map { number -> number + 1 }
			.forEach { number -> println(number)}

	}

}