import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.2.71"
    id("org.jetbrains.kotlin.plugin.spring") version "1.2.71"
    id("org.jetbrains.kotlin.kapt") version "1.2.71"
    id("org.springframework.boot") version "2.1.4.RELEASE"
}

apply {
    plugin("kotlin")
    plugin("kotlin-kapt")
    plugin("org.springframework.boot")
    plugin("io.spring.dependency-management")
}

group = "io.honeymon.boot.byl"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compile(project(":bootiful-core"))

    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-security")
    compile("de.codecentric:spring-boot-admin-starter-client:2.1.4")

    testCompile("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
        dependsOn(processResources) // kotlin 에서 ConfigurationProperties
    }


    compileTestKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
}