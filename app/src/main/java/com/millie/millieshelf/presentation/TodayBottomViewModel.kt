package com.millie.millieshelf.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.millie.millieshelf.R
import com.millie.millieshelf.domain.entity.Book

class TodayBottomViewModel : ViewModel() {
    var monthlyList: MutableLiveData<List<Book>> = MutableLiveData<List<Book>>()
    var originalChipList: MutableLiveData<List<String>> = MutableLiveData<List<String>>()
    var millieOriginalList: MutableLiveData<List<Book>> = MutableLiveData<List<Book>>()

    init {
        monthlyList.value = listOf(
            Book(
                R.drawable.img_monthly_1,
                "연인 포토 에세이:\n파트1",
                "MBC 드라마 <연인> 제..",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_2,
                "이명난청 완치설명서",
                "가토 토시노리",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_3,
                "내가 엄마들 모임에\n안 나가는 이유",
                "강빈맘",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_4,
                "계간 미스터리 2023\n가을호",
                "고나무 한이 문경, …",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_5,
                "걱정 끄기 연습",
                "가토 토시노리",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_6,
                "아더랜드",
                "토머스 할리데이지",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_7,
                "요괴도시",
                "배명은, 김설아, 유미르..",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_8,
                "ETF 투자지도",
                "최창윤",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_9,
                "부처스 크로싱",
                "존 윌리엄스",
                null,
                null,
            ),
            Book(
                R.drawable.img_monthly_10,
                "영화관에서 만나는 의\n학의 세계",
                "고병수",
                null,
                null,
            ),
        )
        originalChipList.value = listOf("인기", "정기구독", "소설", "SF", "로맨스", "연재 중")
    }
}
