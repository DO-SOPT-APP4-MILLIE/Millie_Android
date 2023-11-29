package com.millie.millieshelf.Best.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseBookDto(
    @SerialName("code")
    val code: Int,
    @SerialName("msg")
    val message: String = "",
    @SerialName("data")
    val data: List<ResponseBookData> = emptyList()
)
