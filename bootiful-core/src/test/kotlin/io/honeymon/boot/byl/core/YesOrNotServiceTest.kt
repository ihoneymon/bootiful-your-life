package io.honeymon.boot.byl.core

import io.honeymon.boot.byl.core.config.YesOrNotConfiguration
import io.honeymon.boot.byl.core.service.BooleanService
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@ActiveProfiles("yes")
@RunWith(SpringRunner::class)
@SpringBootTest(classes = [YesOrNotConfiguration::class])
class YesServiceTest {
    @Autowired
    lateinit var booleanService: BooleanService

    @Test
    fun testYesOrNotYes() {
        assertThat(booleanService.isYes()).isTrue()
    }
}

@ActiveProfiles("not")
@RunWith(SpringRunner::class)
@SpringBootTest(classes = [YesOrNotConfiguration::class])
class NotServiceTest {
    @Autowired
    lateinit var booleanService: BooleanService

    @Test
    fun testYesOrNotYes() {
        assertThat(booleanService.isYes()).isFalse()
    }
}