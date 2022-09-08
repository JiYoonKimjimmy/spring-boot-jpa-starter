package me.jimmyberg.jpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootJpaStarterApplication

fun main(args: Array<String>) {
    runApplication<SpringBootJpaStarterApplication>(*args)
}
