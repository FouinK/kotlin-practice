package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val person = Person("성현")
		val name = "윤성현"

		println("person.name = ${person.name}")
		println("name = $name")
	}

	 class Person {
		 var name: String

		 constructor(name: String) {
			 this.name = name
		 }
	 }
}
