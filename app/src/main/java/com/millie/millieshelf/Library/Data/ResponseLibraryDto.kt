package com.millie.millieshelf.Library.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseLibraryDto(
    @SerialName("code")
    val code: Int,
    @SerialName("msg")
    val message: String = "",
    @SerialName("data")
    val data: List<ResponseLibData> = emptyList()
)

