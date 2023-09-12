package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val people = mutableListOf(
			Person("성현", 10),
			Person("성현", 10),
			Person("윤성현", 10),
			Person("윤성현", 10),
			Person("윤성현", 10),
			Person("윤성현", 10),
			Person("현성", 10),
			Person("현성", 10),
			Person("현성", 10),
			Person("현성", 10),
			Person("현성", 10)
		)

		val isSung: (Person) -> Boolean = fun(person: Person): Boolean {
			return person.name == "성현"
		}

		val isHyun: (Person) -> Boolean = {person: Person -> person.name == "현성"}

		println(isSung(people[0]))
		println(isHyun.invoke(people[6]))

		val filterPerson = filterPerson(people, isSung)
	}

	private fun filterPerson(
		personList: List<Person>,
		filter: (Person) -> Boolean): List<Person> {

		val result = mutableListOf<Person>()
		for (person in personList) {
			if (filter(person)) {
				result.add(person)
			}
		}

		return result
	}
}

data class Person (
	var name: String,
	var age: Int,
)