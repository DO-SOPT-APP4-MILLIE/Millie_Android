package com.millie.millieshelf.presentation.todaybottom

import androidx.lifecycle.ViewModel
import com.millie.millieshelf.R
import com.millie.millieshelf.domain.entity.Book
import com.millie.millieshelf.domain.entity.OriginalBook

class TodayBottomViewModel : ViewModel() {
    var monthlyList: List<Book> = listOf(
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
    var originalChipList: List<String> = listOf("인기", "정기구독", "소설", "SF", "로맨스", "연재 중")
    var millieOriginalList: List<OriginalBook> = listOf(
        OriginalBook(
            "나는 왜 자꾸 내 탓을 할까",
            "허규형",
            R.drawable.today_img_original_1,
            "오늘을 잘살고 싶은\n우리를 위한 심리 필독서",
        ),
        OriginalBook(
            "작별 인사",
            "김영하",
            R.drawable.today_img_original_2,
            "어느날 갑자기 수용소로 끌려간\n소년의 여정을 담은 장편소설",
        ),
        OriginalBook(
            "마음의 법칙",
            "폴커 키츠, 마누엘 투쉬 / 김희상",
            R.drawable.today_img_original_3,
            "사람의 마음을 사로잡는\n51가지 심리학",
        ),
        OriginalBook(
            "[독점] 짝사랑 중입니다",
            "진양",
            R.drawable.today_img_original_4,
            "진지한 짝사랑 이야기를 담은\n밀리 오리지널 로맨스",
        ),
    )
}
