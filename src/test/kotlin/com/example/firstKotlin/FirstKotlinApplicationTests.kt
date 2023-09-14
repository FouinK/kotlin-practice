package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val fruits = mutableListOf(
			null,
			Fruit(1L, "사과", 1000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "노사과", 3000L, 2000L),
			Fruit(1L, "사과", 4000L, 2000L),
			Fruit(1L, "사과", 4000L, 2000L),
			Fruit(1L, "사과", 4000L, 2000L),
			Fruit(1L, "사과", 4000L, 2000L),
			Fruit(1L, "사과", 2000L, 2000L),
			Fruit(1L, "노사과", 1000L, 2000L),
			null
		)

		println(fruits.first())
		println(fruits.firstOrNull())
		println(fruits.last())
		println(fruits.lastOrNull())

	}

	private fun filterFruits(
		fruits: List<Fruit>, filter: (Fruit) -> Boolean
	): List<Fruit> {
		return fruits.filter(filter)
	}

}

data class Fruit(
	val id: Long,
	val name: String,
	val factoryPrice: Long,
	val currentPrice: Long,
)