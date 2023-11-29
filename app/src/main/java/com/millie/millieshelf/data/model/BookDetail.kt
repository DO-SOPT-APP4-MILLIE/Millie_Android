package com.millie.millieshelf.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookDetail(
    @SerialName("archivedCount")
    val archivedCount: String = "",
    @SerialName("author")
    val author: String = "",
    @SerialName("description")
    val description: String = "",
    @SerialName("id")
    val id: String = "",
    @SerialName("imageUrl")
    val imageUrl: String = "",
    @SerialName("postCount")
    val postCount: String = "",
    @SerialName("reviewCount")
    val reviewCount: String = "",
    @SerialName("title")
    val title: String = ""
)