package com.example.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "ms-account")
interface AccountService {
    @GetMapping("/accounts/test")
    fun test():String

    @GetMapping("/accounts/list")
    fun list():List<String>
}