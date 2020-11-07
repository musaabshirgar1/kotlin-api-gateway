package com.musaabshirgar1.os.api.service

import com.musaabshirgar1.os.api.common.Payment
import com.musaabshirgar1.os.api.common.TransactionRequest
import com.musaabshirgar1.os.api.common.TransactionResponse
import com.musaabshirgar1.os.api.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class OrderService @Autowired constructor(
    private val orderRepository: OrderRepository,
    private val restTemplate: RestTemplate
) {
    fun saveOrder(transactionRequest: TransactionRequest): TransactionResponse? {
        var response: String? = ""
        val order = transactionRequest.order
        val payment = transactionRequest.payment
        payment?.orderId = order?.id
        payment?.amount = order?.price
        /**
         * Do A Rest Call From Here
         */
        val paymentResponse = restTemplate.postForObject(
            "http://PAYMENT-SERVICE/payment/doPayment",
            payment,
            Payment::class.java
        )

        response =
            if (paymentResponse?.paymentStatus?.equals("Success")!!)
                "Payment Processing Successful and Order Placed"
            else
                "There was a Failure in Processing the Order"

        order?.let { orderRepository.save(it) }
        return TransactionResponse(
            order = order,
            amount = paymentResponse.amount,
            transactionId = paymentResponse.transactionId,
            response = response
        )
    }
}