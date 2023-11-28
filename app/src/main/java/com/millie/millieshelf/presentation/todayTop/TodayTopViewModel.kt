package com.millie.millieshelf.presentation.todayTop

import androidx.lifecycle.ViewModel
import com.millie.millieshelf.R
import com.millie.millieshelf.model.TodayAttentionModel
import com.millie.millieshelf.model.TodayBookmarkModel

class TodayTopViewModel : ViewModel() {
    val mockTodayBookmarkList: List<TodayBookmarkModel> = listOf(
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "서점 베스트"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "완독지수"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "챗북 소식"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "밀리 시리즈"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "요즘 관심사"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "밀리 아티클"),
        TodayBookmarkModel(R.drawable.ic_today_bookmark_thumbs_up, "매거진 소식"),
    )

    val mockTodayAttentionList: List<TodayAttentionModel> = listOf(
        TodayAttentionModel(0, R.drawable.iv_today_attention_img_1),
        TodayAttentionModel(1, R.drawable.iv_today_attention_img_2),
        TodayAttentionModel(2, R.drawable.iv_today_attention_img_3),
        TodayAttentionModel(3, R.drawable.iv_today_attention_img_4),
        TodayAttentionModel(4, R.drawable.iv_today_attention_img_5),
        TodayAttentionModel(4, R.drawable.iv_today_attention_img_6)
    )
}