package com.musaabshirgar1.cloudgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
class CloudGatewayApplication

fun main(args: Array<String>) {
	runApplication<CloudGatewayApplication>(*args)
}
