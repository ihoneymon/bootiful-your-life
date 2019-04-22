package io.honeymon.boot.byl.core.config

import io.honeymon.boot.byl.core.service.NotYesService
import io.honeymon.boot.byl.core.service.YesService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
open class YesOrNotConfiguration {
    @Profile("yes")
    @Configuration
    open class YesConfiguration {
        @Bean
        open fun booleanService() = YesService()
    }

    @Profile(value = ["!yes"])
    @Configuration
    open class notYesConfiguration {
        @Bean
        open fun booleanService() = NotYesService()
    }
}


