package br.com.luisguts.example.controllers

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HealthCheckController{

    @GetMapping("/")
    fun check(): ResponseEntity<Any> = ResponseEntity.ok("Hello from PDD")

}