import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    id("org.springframework.boot") version "2.7.0"
}
apply(plugin = "io.spring.dependency-management")

group = "io.beautrace"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("io.beautrace:beautrace-spring-servlet:1.0-SNAPSHOT")

    testImplementation(kotlin("test"))
}

tasks.compileKotlin {
    kotlinOptions.freeCompilerArgs += "-java-parameters"
}

springBoot {
    mainClass.set("io.beautrace.spring.servlet.app.MainKt")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}