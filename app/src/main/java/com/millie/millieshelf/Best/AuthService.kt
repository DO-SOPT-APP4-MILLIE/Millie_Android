package com.millie.millieshelf.Best

import com.millie.millieshelf.Best.Data.ResponseBookDto
import retrofit2.Call
import retrofit2.http.GET

interface AuthService {
    @GET("/api/books")
    fun getBookList(): Call<ResponseBookDto>
}