package com.musaabshirgar1.ps.api.controller

import com.musaabshirgar1.ps.api.entity.Payment
import com.musaabshirgar1.ps.api.service.PaymentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/payment")
class PaymentController @Autowired constructor(
    private val paymentService: PaymentService
) {

    @RequestMapping("/doPayment")
    fun doPayment(@RequestBody payment: Payment): Payment {
        return paymentService.doPayment(payment)
    }

    @GetMapping("/{orderId}")
    fun findPaymentHistoryByOrderId(@PathVariable orderId: Int): Payment {
        return paymentService.findPaymentHistoryByOrderId(orderId)
    }
}