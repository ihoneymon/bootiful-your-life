package io.honeymon.boot.byl.core.config

import io.honeymon.boot.byl.core.service.NotYesService
import io.honeymon.boot.byl.core.service.YesService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class YesOrNotConfiguration {
    @Profile("yes")
    @Configuration
    class YesConfiguration {
        @Bean
        fun booleanService() = YesService()
    }

    @Profile("!yes")
    @Configuration
    class NotYesConfiguration {
        @Bean
        fun booleanService() = NotYesService()
    }
}


