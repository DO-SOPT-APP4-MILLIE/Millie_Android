package com.millie.millieshelf.Best.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseBookData(
    @SerialName("id")
    val id: Long,
    @SerialName("title")
    val title: String = "",
    @SerialName("thumbnail")
    val imageUrl: String = "",
    @SerialName("author")
    val author: String = "",
    @SerialName("completionRate")
    val completionRate: Int,
    @SerialName("readingTime")
    val readingTime: Int,
    @SerialName("rankChange")
    val rankChange: Int?
)