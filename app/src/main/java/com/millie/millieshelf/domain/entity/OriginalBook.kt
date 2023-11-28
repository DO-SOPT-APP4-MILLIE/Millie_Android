package com.millie.millieshelf.domain.entity

import androidx.annotation.DrawableRes

data class OriginalBook(
    val title: String,
    val author: String,
    @DrawableRes val image: Int,
    val description: String,
)
