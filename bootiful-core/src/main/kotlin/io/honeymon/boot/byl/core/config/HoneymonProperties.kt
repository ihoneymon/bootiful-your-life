package io.honeymon.boot.byl.core.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * Component 는 Configuration 클래스에서 불러오는 곳이 없는 경우 선언
 */
@Component
@ConfigurationProperties(prefix = "io.honeymon")
class HoneymonProperties {
    lateinit var name: String
    lateinit var age: String
    lateinit var email: String
    lateinit var homesite: String
}
