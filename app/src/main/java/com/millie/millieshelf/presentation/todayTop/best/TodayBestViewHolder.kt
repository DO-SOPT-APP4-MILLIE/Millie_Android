package com.millie.millieshelf.presentation.todayTop.best

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemTodayBestContentBinding
import com.millie.millieshelf.model.response.TodayBest
import kotlin.random.Random

class TodayBestViewHolder(private val binding: ItemTodayBestContentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(data: TodayBest.Data) =
        with(binding) {
            tvTodayBestRank.text = data.id.toString()
            val rand = Random.nextInt(3)
            tvTodayBestRankChange.text = when(rand){
                0 -> "-"
                1 -> "New"
                2 -> "▾ 1"
                else -> "▴ 1"
            }
            //tvTodayBestRankChange.setTextColor(rand값에 맞는 색상)
            //ivTodayBestBook.load(data.thumbnail)
            tvTodayBestBookName.text = data.title
            tvTodayBestBookAuthor.text = data.author
            tvTodayBestBookCompletionRate.text = data.completionRate.toString()
            tvTodayBestBookCompletionRate.text = binding.root.context.getString(R.string.BEST_PERCENT_TIME, data.completionRate, data.readingTime )
        }

}
