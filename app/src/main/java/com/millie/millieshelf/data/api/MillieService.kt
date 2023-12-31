package com.millie.millieshelf.data.api

import com.millie.millieshelf.data.model.BaseResponse
import com.millie.millieshelf.data.model.BookCollections
import com.millie.millieshelf.data.model.BookDetail
import com.millie.millieshelf.model.response.PostArchiveResponse
import com.millie.millieshelf.model.response.TodayBest
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface MillieService {
    @GET("/api/books")
    fun getBooks(): Call<TodayBest>

    @GET("/api/books/{bookId}")
    fun getBook(
        @Path("bookId") bookId: Int,
    ): Call<BaseResponse<BookDetail>>

    @GET("/api/books/{bookId}")
    suspend fun getBookDetail(
        @Path("bookId") bookId: Int,
    ): Result<BaseResponse<BookDetail>>

    @POST("/api/books/{bookId}/archive")
    fun postArchiveBook(
        @Header("X-AUTH-ID") userId: Int = 1,
        @Path("bookId") bookId: String,
    ): Call<PostArchiveResponse>

    @GET("/api/me/collections")
    fun getBookCollections(@Header("X-AUTH-ID") userId: Int = 1): Call<BaseResponse<List<BookCollections>>>
}
