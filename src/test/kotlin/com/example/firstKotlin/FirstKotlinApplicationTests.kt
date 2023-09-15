package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {

		abc@ for (i in 1..100) {
			for (j in 1..10) {
				if (j == 2) {
					break@abc
				}
				println("i = ${i}")
				println("j = ${j}")
			}
		}
	}

}