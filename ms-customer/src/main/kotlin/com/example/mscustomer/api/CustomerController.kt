package com.example.mscustomer.api

import com.example.mscustomer.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController @Autowired constructor(private val accountService: AccountService) {
    @Value("7070")
    lateinit var port:String
    @GetMapping("/test")
    fun test():String{
        val result = accountService.test();
        return "server port: $port -> $result"
    }
    @GetMapping("/list")
    fun getCustomers(): List<String> {
        return listOf("Jhon", "Jane", "Jack") + accountService.list();
    }
}