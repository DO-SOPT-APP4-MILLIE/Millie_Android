package com.millie.millieshelf.Best

import com.millie.millieshelf.Library.Data.ResponseLibraryDto
import retrofit2.Call
import retrofit2.http.GET

interface LibService {
    @GET("/api/me/collections")
    fun getBookList(): Call<ResponseLibraryDto>
}