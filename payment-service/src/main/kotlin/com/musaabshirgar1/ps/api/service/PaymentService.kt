package com.musaabshirgar1.ps.api.service

import com.musaabshirgar1.ps.api.entity.Payment
import com.musaabshirgar1.ps.api.repository.PaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PaymentService @Autowired constructor(
    private val paymentRepository: PaymentRepository
) {

    fun doPayment(payment: Payment): Payment {
        payment.paymentStatus = paymentProcessing()
        payment.transactionId = UUID.randomUUID().toString()
        return paymentRepository.save(payment)
    }

    fun paymentProcessing(): String = if (Random().nextBoolean()) "Success" else "Failure"

    fun findPaymentHistoryByOrderId(orderId: Int): Payment {
            return paymentRepository.findByOrderId(orderId)
    }
}