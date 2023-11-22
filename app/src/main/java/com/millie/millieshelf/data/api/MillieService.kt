package com.millie.millieshelf.data.api

import com.millie.millieshelf.data.model.BaseResponse
import com.millie.millieshelf.data.model.Book
import com.millie.millieshelf.data.model.BookCollections
import com.millie.millieshelf.data.model.BookDetail
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MillieService {
    @GET("/api/books")
    fun getBooks(): List<BaseResponse<Book>>

    @GET("/api/books/{bookId}")
    fun getBook(
        @Path("bookId") bookId: String,
    ): BaseResponse<BookDetail>

    @POST("/api/books/{bookId}/archive")
    fun postArchiveBook(
        @Path("bookId") bookId: String,
    ): BaseResponse<Unit>

    @GET("/api/me/collections")
    fun getBookCollections(): List<BaseResponse<BookCollections>>
}
