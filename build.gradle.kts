import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    id("org.springframework.boot") version "2.7.0"
}
apply(plugin = "io.spring.dependency-management")

group = "com.beautrace"
version = "1.0.2"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    runtimeOnly("com.beautrace:beautrace-spring-servlet:1.0.2")

    testImplementation(kotlin("test"))
}

tasks.compileKotlin {
    kotlinOptions {
        javaParameters = true
    }
}

springBoot {
    mainClass.set("com.beautrace.spring.servlet.app.MainKt")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}