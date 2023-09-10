package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.lang.IllegalArgumentException
import java.util.IllegalFormatException

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(getGradeWithSwitch(1000))
	}


	fun getGradeWithSwitch(score: Int): String {
		return when (score / 10) {
			9 -> "A"
			in 7..8 -> "B"
			else -> "C"
		}
	}
}
