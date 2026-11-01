package com.example
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
@SpringBootApplication class App
fun main(args: Array<String>) { runApplication<App>(*args) }
@RestController class Api {
 @GetMapping("/") fun home() = mapOf("service" to "employee-service", "status" to "running")
 @GetMapping("/health") fun health() = mapOf("status" to "UP")
 @GetMapping("/api/employees") fun api() = listOf(mapOf("id" to 1, "name" to "Asha"), mapOf("id" to 2, "name" to "Ravi"))
}
