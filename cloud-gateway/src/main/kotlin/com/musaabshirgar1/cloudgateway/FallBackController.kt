package com.musaabshirgar1.cloudgateway

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class FallBackController {
   @RequestMapping("/orderFallBack")
   fun orderServiceFallBack(): Mono<String> {
      return Mono.just("Order Service is taking too long to respond or is down. Please try again later")
   }

   @RequestMapping("/paymentFallBack")
   fun paymentServiceFallBack(): Mono<String> {
      return Mono.just("Payment Service is taking too long to respond or is down. Please try again later")
   }
}