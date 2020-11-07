package com.musaabshirgar1.os.api.controller

import com.musaabshirgar1.os.api.common.TransactionRequest
import com.musaabshirgar1.os.api.common.TransactionResponse
import com.musaabshirgar1.os.api.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController @Autowired constructor(
    private val orderService: OrderService
) {
    @RequestMapping("/bookOrder")
    fun bookOrder(
        @RequestBody transactionRequest: TransactionRequest
    ): TransactionResponse? {
        return orderService.saveOrder(transactionRequest)
    }
}