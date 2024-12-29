package com.kotlin.payment.service

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class PaymentService {

    private final val paymentStatusService: PaymentStatusService = TODO("initialize me")

    fun pay(
        payServiceRequest: PayServiceRequest
    ): PayServiceResponse {
        //요청을 저장
        val orderId = paymentStatusService.savePayRequest(
            payUserId = payServiceRequest.payUserId,
            amount = payServiceRequest.amount,
            orderTitle = payServiceRequest.orderTitle,
            merchantTransactionId = payServiceRequest.merchantTransactionId
        )
        // 계좌에 금액 사용 요청
        // 성공: 거래를 성공으로 저장
        // 실패: 거래를 실패로 저장
        return PayServiceResponse(
            payUserId = "payUserId",
            amount = 100,
            transactionId = "transactionId",
            transactedAt = LocalDateTime.now()
        )
    }
}

class PayServiceRequest(
    val payUserId: String,
    val amount: Long,
    val merchantTransactionId: String,
    val orderTitle: String
) {

}

class PayServiceResponse(
    val payUserId: String,
    val amount: Long,
    val transactionId: String,
    val transactedAt: LocalDateTime
) {

}