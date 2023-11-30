package com.millie.millieshelf.Library.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LibraryCategoryData(
    @SerialName("category")
    val category: String,
    @SerialName("books")
    val bookData: List<BookData>
)

