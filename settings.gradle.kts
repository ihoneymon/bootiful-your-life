pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}
rootProject.name = "bootiful-your-life"

/**
 * bootiful-core: 도메인 및 공통 사용 컴포넌트
 * bootiful-sbadmin: Spring Boot Admin Server
 * bootiful-api: Spring Boot Admin Client 를 포함한 API Application
 */
include("bootiful-core", "bootiful-sbadmin", "bootiful-api")