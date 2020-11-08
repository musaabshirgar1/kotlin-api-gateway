package com.musaabshirgar1.ps.api.repository

import com.musaabshirgar1.ps.api.entity.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Int> {
   fun findByOrderId(orderId: Int): Payment
}
