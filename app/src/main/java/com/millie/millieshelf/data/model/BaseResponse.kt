package com.millie.millieshelf.data.model

data class BaseResponse<T>(
    val code: Int,
    val message: String,
    val data: T,
)
