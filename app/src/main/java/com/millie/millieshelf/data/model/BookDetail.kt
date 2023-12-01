package com.millie.millieshelf.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookDetail(
    @SerialName("id")
    val id: Long,
    @SerialName("title")
    val title: String,
    @SerialName("author")
    val author: String,
    @SerialName("thumbnail")
    val thumbnail: String,
    @SerialName("archivedCount")
    val archivedCount: Int,
    @SerialName("postCount")
    val postCount: Int,
    @SerialName("reviewCount")
    val reviewCount: Int,
    @SerialName("Description")
    val description: String,
)
