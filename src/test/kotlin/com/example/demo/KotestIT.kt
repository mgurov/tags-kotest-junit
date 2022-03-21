package com.example.demo

import io.kotest.core.NamedTag
import io.kotest.core.annotation.Tags
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.startWith

@Tags("integration")
@org.junit.jupiter.api.Tag("integration")
class KotestIT : StringSpec({

    tags(NamedTag("integration"))

    "length should return size of string" {
        "hello".length shouldBe 5
    }
    "startsWith should test for a prefix" {
        "world" should startWith("wor")
    }
})