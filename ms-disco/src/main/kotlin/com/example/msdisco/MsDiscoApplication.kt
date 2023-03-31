package com.example.msdisco

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer

class MsDiscoApplication

fun main(args: Array<String>) {
	runApplication<MsDiscoApplication>(*args)
}
