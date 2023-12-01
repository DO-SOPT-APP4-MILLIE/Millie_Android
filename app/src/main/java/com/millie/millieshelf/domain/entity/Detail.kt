package com.millie.millieshelf.domain.entity

data class Detail(
    val id: Long,
    val title: String,
    val author: String,
    val thumbnail: String,
    val archivedCount: Int,
    val postCount: Int,
    val reviewCount: Int,
    val description: String,
)
