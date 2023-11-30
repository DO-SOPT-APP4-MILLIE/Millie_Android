package com.millie.millieshelf.Library.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookData(
    @SerialName("id")
    val id: Long,
    @SerialName("thumbnail")
    val thumbnail: String
)