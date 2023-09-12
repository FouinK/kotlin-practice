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


		filterPerson(people, {person -> person.name == "현성"})		//얘네 둘다 동일한거임
		filterPerson(people) { person -> person.name == "현성" }		//얘네 둘다 동일한거임
	}

	private fun filterPerson(
		personList: List<Person>,
		filter: (Person) -> Boolean //여기서 타입 추론 가능하니까 위에서 : Person 안해줘도 됐던 것
	): List<Person> {

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