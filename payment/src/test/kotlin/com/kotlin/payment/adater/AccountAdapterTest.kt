package com.kotlin.payment.adater

import com.kotlin.payment.adapter.AccountAdapter
import com.kotlin.payment.adapter.UseBalanceRequest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AccountAdapterTest @Autowired constructor(
    private val accountAdapter: AccountAdapter
) {
    @Test
    fun `계좌 사용`() {
        //given
        val useBalanceRequest = UseBalanceRequest(
            userId = 1,
            accountNumber = "1000000001",
            amount = 1000
        )

        //when
        val useBalanceResponse = accountAdapter.useAccount(useBalanceRequest)

        //then
        println(useBalanceResponse)

    }

}