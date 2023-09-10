package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(myif(null))
	}

	fun myif(str: String?): String {
		return if (str == "A") {
			"A"
		} else {
			"B"
		}
	}
}
