package com.musaabshirgar1.os.api.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
data class Order(
        @Id
        var id: Int? = null,
        var name: String? = null,
        var qty: Int? = null,
        var price: Double? = null
)