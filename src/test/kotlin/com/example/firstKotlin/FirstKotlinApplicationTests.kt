package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(getGradeWithSwitch("A성현"))
	}


	fun getGradeWithSwitch(obj: Any): Boolean {
		return when (obj) {
			is String -> obj.startsWith("A")
			else -> false
		}
	}
}
