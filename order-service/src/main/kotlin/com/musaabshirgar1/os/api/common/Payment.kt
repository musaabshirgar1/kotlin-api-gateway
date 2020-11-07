package com.musaabshirgar1.os.api.common

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class Payment(
        var paymentId: Int? = null,
        var paymentStatus: String? = null,
        var transactionId: String? = null,
        var orderId: Int? = null,
        var amount: Double? = null
)