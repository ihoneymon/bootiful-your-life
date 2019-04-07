package io.honeymon.boot.byl.api

import io.honeymon.boot.byl.api.service.NotYesService
import io.honeymon.boot.byl.api.service.YesService
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
open class YesOrNotConfiguration

@Profile("yes")
fun yesService() = YesService()

@Profile(value = ["!yes"])
fun notYesService() = NotYesService()