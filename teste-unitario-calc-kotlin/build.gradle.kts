plugins {
    kotlin("jvm") version "1.8.0"
    id("org.jetbrains.kotlin.plugin.spring") version "1.8.0"
    id("jacoco")
    application
}

group = "miguel.schrempp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.testng:testng:7.7.0")
    testImplementation(kotlin("test"))
    testImplementation("io.mockk:mockk:${1.9}")

}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("AppKt")
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.test {
    useJUnitPlatform()
}
