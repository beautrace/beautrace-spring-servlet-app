import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    id("org.springframework.boot") version "2.7.0"
}
apply(plugin = "io.spring.dependency-management")

group = "io.beautrace"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-aop
    implementation("org.springframework.boot:spring-boot-starter-aop")

    testImplementation(kotlin("test"))
}

springBoot {
    mainClass.set("io.beautrace.MainKt")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}