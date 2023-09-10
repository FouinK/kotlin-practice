package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val str = "성현윤"
		println("${str[0]}")
		println(str[0])


	}

	 class Person {
		 var name: String

		 constructor(name: String) {
			 this.name = name
		 }
	 }
}
