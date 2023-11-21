package com.millie.millieshelf.model

sealed class TodayTopModel {
    abstract val type: String

    data class Banner(
        override val type: String
    ) : TodayTopModel()

    data class Bookmark(
        override val type: String,
        val title: String,
        val buttonList: List<String>
    ) : TodayTopModel()

    data class Best(
        override val type: String,
        val title: String,
        val comment: String
    ) : TodayTopModel()

    data class Attention(
        override val type: String,
        val title: String
    ) : TodayTopModel()
}
