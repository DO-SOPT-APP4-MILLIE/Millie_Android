package com.millie.millieshelf.presentation.todayTop

import androidx.lifecycle.ViewModel
import com.millie.millieshelf.R
import com.millie.millieshelf.model.TodayAttentionModel
import com.millie.millieshelf.model.TodayBookmarkModel
import com.millie.millieshelf.model.response.TodayBest

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

    val mockTodayBestList: List<TodayBest.Data> = listOf(
        TodayBest.Data(
            id = 1,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 2,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 3,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 4,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 5,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 6,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 7,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 8,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
        TodayBest.Data(
            id = 9,
            title = "트렌드 코리아 2023",
            thumbnail = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.velog.io%2Fimages%2Fmouse0429%2Fpost%2F19b9158e-731a-4e60-ab43-efcdafd9244e%2F%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C.png&tbnid=bW7h1y8puOQadM&vet=12ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ..i&imgrefurl=https%3A%2F%2Fvelog.io%2F%40mouse0429%2FGithub%25EA%25B9%2583%25ED%2597%2588%25EB%25B8%258C-%25EA%25B8%25B0%25EB%25B3%25B8-%25EA%25B0%259C%25EB%2585%2590&docid=0x91vF8EDsf2YM&w=2494&h=1403&q=%EA%B9%83%ED%97%88%EB%B8%8C&ved=2ahUKEwil4u6emuaCAxX9Z_UHHZpID9YQMygBegQIARBZ",
            author = "temp",
            completionRate = 42,
            readingTime = 134
        ),
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