package com.millie.millieshelf.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookCollections(
    @SerialName("books")
    val books: List<BookCollection> = listOf(),
    @SerialName("category")
    val category: String = "",
) {
    @Serializable
    data class BookCollection(
        @SerialName("id")
        val id: String = "",
        @SerialName("imageUrl")
        val imageUrl: String = "",
    )
}
