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
    compile("org.jetbrains.kotlin:kotlin-reflect")
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compile("org.springframework.boot:spring-boot")
    compile("org.springframework.boot:spring-boot-starter-logging")

    /**
     * @see <a href="https://kotlinlang.org/docs/reference/kapt.html">Annotation Processing with Kotlin</a>
     */
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    compileOnly("org.springframework.boot:spring-boot-configuration-processor")

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

val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = false
jar.enabled = true