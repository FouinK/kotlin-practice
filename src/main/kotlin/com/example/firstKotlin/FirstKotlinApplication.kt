package com.example.firstKotlin

import com.example.firstKotlin.calzz.Derived
import com.example.firstKotlin.calzz.People
import com.example.firstKotlin.calzz.Person
import com.example.firstKotlin.calzz.Singleton
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

	runApplication<FirstKotlinApplication>(*args)
}
