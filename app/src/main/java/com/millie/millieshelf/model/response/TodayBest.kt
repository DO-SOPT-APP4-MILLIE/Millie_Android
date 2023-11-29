package com.millie.millieshelf.model.response

data class TodayBest(
    val code: Int,
    val data: List<Data>,
    val msg: String
) {
    data class Data(
        val id: Long,
        val title: String,
        val thumbnail: String,
        val author: String,
        val completionRate: Int,
        val readingTime: Int,
        val rankChange: Int?
    )
}