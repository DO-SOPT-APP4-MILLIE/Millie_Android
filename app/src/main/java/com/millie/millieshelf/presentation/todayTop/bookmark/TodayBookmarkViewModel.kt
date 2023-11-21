package com.millie.millieshelf.presentation.todayTop.bookmark

import com.millie.millieshelf.R
import com.millie.millieshelf.model.TodayBookmarkModel

class TodayBookmarkViewModel {
    val mockTodayBookmarkList: List<TodayBookmarkModel> = listOf(
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "서점 베스트"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "완독지수"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "챗북 소식"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "밀리 시리즈"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "요즘 관심사"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "밀리 아티클"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "매거진 소식"),
    )
}