package com.kotlin.payment.domain

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class OrderTransaction(
    val transactionId: String,
    @ManyToOne
    val order: Order,
    @Enumerated(EnumType.STRING)
    val transactionType: TransactionType, // 결제, 취소, 망취소
    @Enumerated(EnumType.STRING)
    val transactionStatus: TransactionStatus, // 생성, 성공, 실패
    val transactionAmount: Long,
    val merchantTransactionId: String,
    var paymentMethodTransactionId: String? = null,
    var transactionAt: LocalDateTime? = null,
    var failureCode: String? = null,
    var description: String? = null
) : BaseEntity() {

}