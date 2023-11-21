package com.millie.millieshelf.presentation.todayTop

import androidx.lifecycle.ViewModel
import com.millie.millieshelf.R
import com.millie.millieshelf.model.TodayAttentionModel
import com.millie.millieshelf.model.TodayBookmarkModel
import com.millie.millieshelf.model.TodayTopModel

class TodayTopViewModel : ViewModel() {
    private val mockTodayBookmarkList: List<TodayBookmarkModel> = listOf(
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "서점 베스트"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "완독지수"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "챗북 소식"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "밀리 시리즈"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "요즘 관심사"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "밀리 아티클"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_temp_black_24, "매거진 소식"),
    )

    private val mockTodayAttentionList: List<TodayAttentionModel> = listOf(
        TodayAttentionModel(0, R.drawable.img_today_attention_content),
        TodayAttentionModel(1, R.drawable.img_today_attention_content),
        TodayAttentionModel(2, R.drawable.img_today_attention_content),
        TodayAttentionModel(3, R.drawable.img_today_attention_content),
        TodayAttentionModel(4, R.drawable.img_today_attention_content)
    )

    val mockTodayList: List<TodayTopModel> = listOf(
        TodayTopModel.Banner(ARGS_BANNER),
        TodayTopModel.Bookmark(ARGS_BOOKMARK, "즐겨찾기", mockTodayBookmarkList),
        TodayTopModel.Best(ARGS_BEST, "지금! 서점베스트", "서점 3사 100위 내, 70권을 밀리에서 만나보세요"),
        TodayTopModel.Attention(ARGS_ATTENTION, "이번 주 주목할 책", mockTodayAttentionList)
    )

    companion object {
        private const val ARGS_BANNER = "banner"
        private const val ARGS_BOOKMARK = "bookmark"
        private const val ARGS_BEST = "best"
        private const val ARGS_ATTENTION = "attention"

    }
}