package io.honeymon.boot.byl.core

import io.honeymon.boot.byl.api.ApiApplication
import io.honeymon.boot.byl.core.service.HoneymonService
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [ApiApplication::class])
class HoneymonServiceTest {
    @Autowired
    lateinit var honeymonService: HoneymonService

    @Test
    fun getProperties() {
        assertThat(honeymonService.honeymonProperties.name).isEqualTo("김지헌")
        assertThat(honeymonService.honeymonProperties.age).isEqualTo(30)
    }
}