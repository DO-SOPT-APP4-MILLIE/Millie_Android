package com.millie.millieshelf.data.api

import com.millie.millieshelf.data.model.BaseResponse
import com.millie.millieshelf.data.model.Book
import com.millie.millieshelf.data.model.BookCollections
import com.millie.millieshelf.data.model.BookDetail
import com.millie.millieshelf.model.response.TodayBest
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MillieService {
    @GET("/api/books")
    fun getBooks(): Call<TodayBest>

    @GET("/api/books/{bookId}")
    fun getBook(
        @Path("bookId") bookId: String,
    ): Call<BaseResponse<BookDetail>>

    @POST("/api/books/{bookId}/archive")
    fun postArchiveBook(
        @Path("bookId") bookId: String,
    ): Call<BaseResponse<Unit>>

    @GET("/api/me/collections")
    fun getBookCollections(): Call<List<BaseResponse<BookCollections>>>
}
