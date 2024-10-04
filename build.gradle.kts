import org.jetbrains.kotlin.gradle.dsl.JvmTarget

group = "io.github.mikaojk"
version = "1.0.0"

val junitJupiterVersion = "5.11.1"
val cliktVersion = "5.0.0"

plugins {
    id("application")
    kotlin("jvm") version "2.0.20"
}

application {
    mainClass.set("mikaojk.github.io.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt-jvm:$cliktVersion")
    implementation("com.github.ajalt.clikt:clikt-markdown:$cliktVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:$junitJupiterVersion")
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

tasks {

    test {
        useJUnitPlatform()
        testLogging {
            events("skipped", "failed")
            showStackTraces = true
            showExceptions = true
            showCauses = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        }
    }
}
