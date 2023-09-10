package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(getGradeWithSwitch(1))
	}


	fun getGradeWithSwitch(number: Int): String {
		return when (number) {
			-1, 0, 1 -> "어디서 많이 본 숫자입니다"
			else -> "-1, 0, 1이 아닙니다"
		}
	}
}
