package com.musaabshirgar1.cloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
class CloudConfigServerApplication

fun main(args: Array<String>) {
   runApplication<CloudConfigServerApplication>(*args)
}
