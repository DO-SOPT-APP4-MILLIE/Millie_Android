package com.millie.millieshelf.model.response

import kotlinx.serialization.Serializable

@Serializable
data class TodayBest(
    val code: Int,
    val msg: String,
    val data: List<Data>
) {
    @Serializable
    data class Data(
        val id: Long,
        val title: String,
        val thumbnail: String,
        val author: String,
        val completionRate: Int,
        val readingTime: Int,
        val rankChange: Int? = null
    )
}