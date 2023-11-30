package com.millie.millieshelf.model

import androidx.annotation.DrawableRes

data class TodayAttentionModel(
    val id: Int,
    @DrawableRes
    val content: Int
)