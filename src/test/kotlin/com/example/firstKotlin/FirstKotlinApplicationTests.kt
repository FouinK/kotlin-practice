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
		val currentFile = File(".")
		val file = File(currentFile.absolutePath + "/a.txt")
		val reader = BufferedReader(FileReader(file))
		println(reader.readLine())
		reader.close()
	}


}
