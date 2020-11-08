package com.musaabshirgar1.os.api.service

import com.musaabshirgar1.os.api.common.Payment
import com.musaabshirgar1.os.api.common.TransactionRequest
import com.musaabshirgar1.os.api.common.TransactionResponse
import com.musaabshirgar1.os.api.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
@RefreshScope
class OrderService constructor(
   @Autowired
   private val orderRepository: OrderRepository,
   @Autowired
   @Lazy
   private val restTemplate: RestTemplate,
   @Value("\${microservice.payment-service.endpoints.endpoint.uri}")
   private val ENDPOINT_URL: String
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
         ENDPOINT_URL,
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