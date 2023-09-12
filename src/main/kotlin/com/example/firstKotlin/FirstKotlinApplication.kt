package com.example.firstKotlin

import com.example.firstKotlin.calzz.*
import com.example.firstKotlin.enums.Country
import com.example.firstKotlin.interfac.Movable
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinApplication

fun main(args: Array<String>) {
	Derived(300)

	val people = People("성현", 10)

	People.newBaby("이름")
	People.Factory.log()

	println("Singleton.a = ${Singleton.a}")
	Singleton.a += 10
	println("Singleton.a = ${Singleton.a}")

	moveSomething(object : Movable {
		override fun move() {
			println("움직이다")
		}

		override fun fly() {
			println("날다")
		}

	})

	val dto1 = PersonDto("윤성현", 100)
	val dto2 = PersonDto("윤성현1", 200)

	println(dto1 == dto2)

	println("dto1 = ${dto1}")

	handleCountry(Country.AMERICA)

//	runApplication<FirstKotlinApplication>(*args)
}

private fun moveSomething(movable: Movable) {
	movable.move()
	movable.fly()
}

fun handleCountry(country: Country) {
	when (country) {
		Country.KOREA -> TODO()
		Country.AMERICA -> TODO()
	}
}