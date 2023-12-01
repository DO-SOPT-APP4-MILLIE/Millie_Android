package com.millie.millieshelf.presentation.best

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemBookBinding
import com.millie.millieshelf.model.response.TodayBest
import kotlin.math.abs

class BestViewHolder(
    private val binding: ItemBookBinding,
    private val onClick: (TodayBest.Data) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(data: TodayBest.Data) {
        itemView.setOnClickListener {
            onClick(data)
        }
        binding.tvBookId.text = data.id.toString()
        binding.tvBookName.text = data.title
        binding.ivBookCover.load(data.thumbnail)
        binding.tvBookAuthor.text = data.author
        binding.tvBookCompletion.text = "${data.completionRate}%"
        binding.tvBookReadingtime.text = "${data.readingTime}분"
        val rankChange = data.rankChange
        val rankChangeText: String
        val textColor: Int = when {
            rankChange == null -> {
                rankChangeText = "New"
                R.color.SubYellow
            }

            rankChange == 0 -> {
                rankChangeText = "-"
                R.color.Black
            }

            rankChange > 0 -> {
                rankChangeText = "▴ $rankChange"
                R.color.MainRed
            }

            else -> {
                rankChangeText = "▾ ${abs(rankChange)}"
                R.color.MainBlue
            }
        }

        setTextColor(rankChangeText, textColor)
    }

    private fun setTextColor(rankChangeText: String, color: Int) {
        binding.tvRanking.text = rankChangeText
        binding.tvRanking.setTextColor(ContextCompat.getColor(binding.root.context, color))
    }
}
