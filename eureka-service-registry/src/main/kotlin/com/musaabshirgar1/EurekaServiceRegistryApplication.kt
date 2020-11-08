package com.musaabshirgar1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaServiceRegistryApplication

fun main(args: Array<String>) {
   runApplication<EurekaServiceRegistryApplication>(*args)
}
