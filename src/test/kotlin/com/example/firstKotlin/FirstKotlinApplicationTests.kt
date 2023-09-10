package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.lang.IllegalArgumentException
import java.util.IllegalFormatException

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(testFor(1000))
	}

	fun testFor(score: Int): Boolean {
		if (score !in 0..100) {
			return false
		} else if (score in 0..100) {
			return true
		} else {
			throw IllegalArgumentException("스코어의 범위를 특정할 수 없습니다")
		}
	}
}
