package com.group.libraryapp.dto.book.response

import com.group.libraryapp.domain.book.BookType

class BookStatResponse(
    val type: BookType,
//    var count: Int
    val count: Long
) {
//    fun plusOne() {
//        this.count++
//    }
}