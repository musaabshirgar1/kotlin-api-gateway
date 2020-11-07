package com.musaabshirgar1.os.api.common

import com.musaabshirgar1.os.api.entity.Order
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class TransactionResponse(
    var order: Order? = null,
    var amount: Double? = null,
    var transactionId: String? = null,
    var response: String? = null
)