package com.millie.millieshelf.Library.Data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseLibData(
    @SerialName("data")
    val data: List<LibraryCategoryData>
)
