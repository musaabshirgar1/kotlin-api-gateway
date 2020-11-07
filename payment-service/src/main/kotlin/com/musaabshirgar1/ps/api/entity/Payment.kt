package com.musaabshirgar1.ps.api.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Payment(
        @Id
        @GeneratedValue
        var paymentId: Int? = null,
        var paymentStatus: String? = null,
        var transactionId: String? = null,
        var orderId: Int? = null,
        var amount: Double? = null
)