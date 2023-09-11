package com.example.firstKotlin

import com.example.firstKotlin.calzz.Derived
import com.example.firstKotlin.calzz.People
import com.example.firstKotlin.calzz.Person
import com.example.firstKotlin.calzz.Singleton
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

	runApplication<FirstKotlinApplication>(*args)
}

private fun moveSomething(movable: Movable) {
	movable.move()
	movable.fly()
}