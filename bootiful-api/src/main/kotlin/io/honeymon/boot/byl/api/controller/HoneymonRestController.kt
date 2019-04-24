package io.honeymon.boot.byl.api.controller

import io.honeymon.boot.byl.core.service.HoneymonPropertiesDto
import io.honeymon.boot.byl.core.service.HoneymonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/honeymon")
class HoneymonRestController(val honeymonService: HoneymonService) {
    @GetMapping("/properties")
    fun getProperties(): HoneymonPropertiesDto = honeymonService.getProperties()
}