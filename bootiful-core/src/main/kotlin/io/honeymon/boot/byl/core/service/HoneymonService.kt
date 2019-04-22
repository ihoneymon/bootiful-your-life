package io.honeymon.boot.byl.core.service

import io.honeymon.boot.byl.core.config.HoneymonProperties
import org.springframework.stereotype.Service

@Service
class HoneymonService(val honeymonProperties: HoneymonProperties)