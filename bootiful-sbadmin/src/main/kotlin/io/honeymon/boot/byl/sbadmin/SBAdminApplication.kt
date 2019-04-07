package io.honeymon.boot.byl.sbadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
open class SBAdminApplication

fun main(args: Array<String>) {
    runApplication<SBAdminApplication>(*args)
}