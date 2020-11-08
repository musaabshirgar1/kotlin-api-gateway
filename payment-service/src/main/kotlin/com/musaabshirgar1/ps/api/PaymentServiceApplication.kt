package com.musaabshirgar1.ps.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class PaymentServiceApplication

fun main(args: Array<String>) {
   runApplication<PaymentServiceApplication>(*args)
}
