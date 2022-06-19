package io.beautrace.spring.servlet.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}