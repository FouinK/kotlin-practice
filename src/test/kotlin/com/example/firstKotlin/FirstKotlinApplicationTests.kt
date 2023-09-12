package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val oldMap = mutableMapOf<Int, String>()
		oldMap.put(1, "STring")
		oldMap[2] = "123"

		val newMap = mapOf(1 to "String", 2 to "String2")

		for (mutableEntry in oldMap) {
			println(mutableEntry.key)
			println(mutableEntry.value)
			println(oldMap.get(mutableEntry.key))
		}

		for (key in newMap.keys) {
			println(key)
			println(newMap[key])
		}

		for ((key, value) in oldMap.entries) {
			println(key)
			println(value)
		}
	}

	private fun printNumbers(numbers: List<Int>) {

	}

	fun printNameAndGender(vararg strings: String) {
		for (string in strings) {
			println(string)
		}
	}

}
