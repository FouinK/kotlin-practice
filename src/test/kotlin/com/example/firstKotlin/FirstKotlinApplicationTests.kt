package com.example.firstKotlin

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

@SpringBootTest
class FirstKotlinApplicationTests {
	@Test
	fun contextLoads() {
		println(max(1, 2))
	}

	fun max(a: Int, b: Int) = if (a > b) a else b

}
