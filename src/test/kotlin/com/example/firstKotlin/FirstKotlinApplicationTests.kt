package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(printNameAndGender(name = "윤성현", gender = "남자"))
	}

	fun printNameAndGender(name: String, gender: String) {
		println(name)
		println(gender)
	}

}
