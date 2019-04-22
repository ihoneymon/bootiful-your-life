package io.honeymon.boot.byl.core.service


interface BooleanService {
    fun isYes(): Boolean
}

class YesService: BooleanService {
    override fun isYes() = true
}

class NotYesService: BooleanService {
    override fun isYes() = false
}