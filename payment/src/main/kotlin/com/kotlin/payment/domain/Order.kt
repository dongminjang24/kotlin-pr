package com.kotlin.payment.domain

import jakarta.persistence.*

@Entity
@Table(name = "orders")
class Order(
    val orderId: String,
    @ManyToOne
    val paymentUser: PaymentUser,
    @Enumerated(EnumType.STRING)
    var orderStatus: OrderStatus,
    val orderTitle: String,
    val orderAmount: Long,
    var paidAmount: Long,
    var refundedAmount: Long,
) : BaseEntity()