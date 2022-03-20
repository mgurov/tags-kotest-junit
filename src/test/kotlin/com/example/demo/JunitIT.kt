package com.example.demo

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Tag("integration")
class JunitIT {

	@Test
	fun contextLoads() {
	}

}
