package com.example.msaccount.api


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountContoller {
    @GetMapping("/test")
    fun test():String{
        return "Hola account"
    }
    @GetMapping("/list")
    fun getCustomers(): List<String> {
        return listOf("Jhon", "Jane", "Jack")
    }
}