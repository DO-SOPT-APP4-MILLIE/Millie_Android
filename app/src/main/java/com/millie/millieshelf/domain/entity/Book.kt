package com.millie.millieshelf.domain.entity

import androidx.annotation.DrawableRes

data class Book(
    @DrawableRes val image: Int,
    val title: String,
    val author: String,
    val completelyReadRate: Int? = null,
    val completelyReadTime: Int? = null,
)
