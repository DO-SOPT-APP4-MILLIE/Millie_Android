package com.millie.millieshelf.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PostArchiveResponse(
    @SerialName("code")
    val code: Int = 0,
    @SerialName("msg")
    val msg: String = "",
)
