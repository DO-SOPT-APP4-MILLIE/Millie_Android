package com.millie.millieshelf.presentation.todaybottom

import androidx.lifecycle.ViewModel
import com.millie.millieshelf.R
import com.millie.millieshelf.domain.entity.Book
import com.millie.millieshelf.domain.entity.CategoryChip
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
    var originalChipList: List<CategoryChip> = listOf(
        CategoryChip("인기", true),
        CategoryChip("정기구독", false),
        CategoryChip("소설", false),
        CategoryChip("SF", false),
        CategoryChip("로맨스", false),
        CategoryChip("연재 중", false),
    )

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

    val weeklyTasteChipList: List<CategoryChip> = listOf(
        CategoryChip("트렌드", false),
        CategoryChip("라이프", false),
        CategoryChip("힐링", false),
        CategoryChip("지적 교양", false),
        CategoryChip("소설", true),

    )

    val weeklyTasteBookList: List<Book> = listOf(
        Book(R.drawable.today_img_novel_1, "[독점] 이제 이혼합니다", "가키야 미우 지음  / 김윤경…", 73, 242),
        Book(R.drawable.today_img_novel_2, "에밀리의 작은 부엌칼", "모리사와 아키오 지음 / …", 46, 204),
        Book(R.drawable.today_img_novel_3, "오르트 구름 넘어", "탁경은", null, null),
        Book(R.drawable.today_img_novel_4, "짱뚱이의 시골 생활 1", "오진희 글 / 신영식  그림", 50, 27),
        Book(
            R.drawable.today_img_novel_5,
            "폭풍의 언덕 - 앤의서재\n여성작가 클래식 5",
            "에밀리 브론테 지음  / 이신…",
            null,
            null,
        ),
        Book(R.drawable.today_img_novel_6, "섬에 있는 서점", "개브리얼 제빈 지음/ 엄일녀…", 61, 199),

    )

    val footerInfoList: List<String> = listOf(
        "이용약관",
        "환불신청",
        "뷰어 다운로드",
        "개인정보처리방침",
        "B2B 문의",
        "저작권/도서오류신고",
        "청소년보호정책",
        "콘텐츠제휴문의",
        "종료 예정 도서",
        "회사 소개",
        "고객센터",
    )
}
