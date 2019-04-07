package io.honeymon.boot.byl.api.service

import org.springframework.stereotype.Service


interface BooleanService {
    fun isYes(): Boolean
}

class YesService: BooleanService {
    override fun isYes() = true
}

class NotYesService: BooleanService {
    override fun isYes() = false
}