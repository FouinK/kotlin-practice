package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val person = Person("성현")
		printAgeIfPerson(person)
	}

	fun printAgeIfPerson(obj: Any?) {
		val person = obj as? Person
		println(person?.name)

		if (obj is Person) {
			val person1 = obj as Person
			println(person1.name)
		}

		if (obj is Person) {
			println(obj.name)
		}
	}

	 class Person {
		 var name: String

		 constructor(name: String) {
			 this.name = name
		 }
	 }
}
