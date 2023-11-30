package com.millie.millieshelf.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookCollections(
    @SerialName("category")
    val category: String = "",
    @SerialName("books")
    val books: List<BookCollection> = listOf(),
) {
    @Serializable
    data class BookCollection(
        @SerialName("id")
        val id: Long,
        @SerialName("thumbnail")
        val thumbnail: String = "",
    )
}
