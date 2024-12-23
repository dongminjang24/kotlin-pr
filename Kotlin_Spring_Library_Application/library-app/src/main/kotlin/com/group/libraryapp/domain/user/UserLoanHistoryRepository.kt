package com.group.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserLoanHistoryRepository: JpaRepository<UserLoanHistory, Long> {

    fun findByBookName(bookName: String): UserLoanHistory?

    fun findByBookNameAndStatus(bookName: String,status: UserLoanStatus): UserLoanHistory?

    fun findAllByStatus(status: UserLoanStatus): List<UserLoanHistory>

    fun countByStatus(status: UserLoanStatus): Long

}