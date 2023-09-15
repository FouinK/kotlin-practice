package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {

	}

	fun getNomberOrNull(number: Int): Int? {
		return number.takeIf { it > 0 }
	}

	fun getNomberOrNullV2(number: Int): Int? {
		return number.takeUnless { it > 0 }
	}

}