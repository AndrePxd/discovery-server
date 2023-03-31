package com.example.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import java.awt.PageAttributes.MediaType
import javax.ws.rs.FormParam

@FeignClient(name = "ms-keycloak",url = "http://localhost:8081/realms/software/protocol/openid-connect/token")
class Keycloak {
    @PostMapping(consumes = [MediaType.APPLICATION_FORM_URLENCODED_VALUE])
    fun token(formParams: Map<String, *>):To
}