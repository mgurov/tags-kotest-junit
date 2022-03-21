package com.example.demo

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class KotestTest : StringSpec({

    "untagged kotest unit test" {
        "hello".length shouldBe 5
    }
})