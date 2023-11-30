package com.millie.millieshelf.presentation.todayTop.best

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemTodayBestContentBinding
import com.millie.millieshelf.model.response.TodayBest
import kotlin.math.abs

class TodayBestViewHolder(private val binding: ItemTodayBestContentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(data: TodayBest.Data) =
        with(binding) {
            tvTodayBestRank.text = data.id.toString()
            tvTodayBestRankChange.text = when {
                data.rankChange == null -> "New"
                data.rankChange == 0 -> "-"
                data.rankChange > 0 -> "▴ ${data.rankChange}"
                else -> "▾ ${abs(data.rankChange)}"
            }
            //tvTodayBestRankChange.setTextColor(rand값에 맞는 색상)
            //ivTodayBestBook.load(data.thumbnail)
            tvTodayBestBookName.text = data.title
            tvTodayBestBookAuthor.text = data.author
            tvTodayBestBookCompletionRate.text = data.completionRate.toString()
            tvTodayBestBookCompletionRate.text = binding.root.context.getString(
                R.string.BEST_PERCENT_TIME,
                data.completionRate,
                data.readingTime
            )
        }

}
