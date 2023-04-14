plugins {
    kotlin("jvm") version "1.8.0"
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

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}