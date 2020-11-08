package com.musaabshirgar1.os.api.repository

import com.musaabshirgar1.os.api.entity.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Int>