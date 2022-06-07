package io.beautrace

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@Configuration
@EnableAspectJAutoProxy
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}