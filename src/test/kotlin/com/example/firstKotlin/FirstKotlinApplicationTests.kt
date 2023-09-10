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
		return when {
			number == 0 -> "0입니다."
			number % 2 == 0 -> "짝수입니다"
			number % 2 != 0 -> "홀수 입니다"
			else -> "홀수입니니다 22"
		}
	}
}
