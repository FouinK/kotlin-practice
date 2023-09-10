package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		val money = JavaMoney(1000)
		val money1 = money
		val money2 = JavaMoney(1000)

		println(money === money1)
		println(money == money1)
		println(money === money2)
		println(money == money2)
	}

	class JavaMoney {
		var amount: Int

		constructor(money: Int) {
			this.amount = money
		}

		override fun equals(other: Any?): Boolean {
			if (this === other) return true
			if (javaClass != other?.javaClass) return false

			other as JavaMoney

			return amount == other.amount
		}

		override fun hashCode(): Int {
			return amount
		}
	}
}
