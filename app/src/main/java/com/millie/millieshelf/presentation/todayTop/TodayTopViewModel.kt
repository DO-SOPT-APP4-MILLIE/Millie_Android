package com.millie.millieshelf.presentation.todayTop

import androidx.lifecycle.ViewModel
import com.millie.millieshelf.model.TodayTopModel

class TodayTopViewModel : ViewModel() {
    val mockTodayList: List<TodayTopModel> = listOf(
        TodayTopModel.Banner(ARGS_BANNER),
        TodayTopModel.Bookmark(ARGS_BOOKMARK, "즐겨찾기", listOf("일단", "아무거나", "해보자")),
        TodayTopModel.Best(ARGS_BEST, "지금! 서점베스트", "서점 3사 100위 내, 70권을 밀리에서 만나보세요"),
        TodayTopModel.Attention(ARGS_ATTENTION, "이번 주 주목할 책")
    )

    companion object {
        private const val ARGS_BANNER = "banner"
        private const val ARGS_BOOKMARK = "bookmark"
        private const val ARGS_BEST = "best"
        private const val ARGS_ATTENTION = "attention"

    }
}