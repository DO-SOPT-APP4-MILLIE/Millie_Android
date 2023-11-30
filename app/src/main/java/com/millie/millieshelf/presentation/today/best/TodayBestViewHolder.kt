package com.millie.millieshelf.presentation.today.best

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemTodayBestContentBinding
import com.millie.millieshelf.model.response.TodayBest
import kotlin.math.abs

class TodayBestViewHolder(private val binding: ItemTodayBestContentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(data: TodayBest.Data) =
        with(binding) {
            tvTodayBestRank.text = data.id.toString()
            with(tvTodayBestRankChange) {
                when {
                    data.rankChange == null -> {
                        text = "New"
                        setTextColor(ContextCompat.getColor(context,R.color.SubYellow))
                    }

                    data.rankChange == 0 -> {
                        text = "-"
                        setTextColor(ContextCompat.getColor(context,R.color.Black))
                    }

                    data.rankChange > 0 -> {
                        text = "▴ ${data.rankChange}"
                        setTextColor(ContextCompat.getColor(context,R.color.MainRed))
                    }

                    else -> {
                        text = "▾ ${abs(data.rankChange)}"
                        setTextColor(ContextCompat.getColor(context,R.color.MainBlue))
                    }
                }
            }
            ivTodayBestBook.load(data.thumbnail)
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
