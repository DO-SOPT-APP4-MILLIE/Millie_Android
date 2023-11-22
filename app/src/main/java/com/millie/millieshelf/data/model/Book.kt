package com.millie.millieshelf.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Book(
    @SerialName("author")
    val author: String = "",
    @SerialName("completionRate")
    val completionRate: String = "",
    @SerialName("id")
    val id: String = "",
    @SerialName("imageUrl")
    val imageUrl: String = "",
    @SerialName("readingTime")
    val readingTime: String = "",
    @SerialName("title")
    val title: String = "",
)
