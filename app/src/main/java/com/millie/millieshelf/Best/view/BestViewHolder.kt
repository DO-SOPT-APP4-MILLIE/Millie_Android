package com.millie.millieshelf.Best.view

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.millie.millieshelf.Best.Data.ResponseBookData
import com.millie.millieshelf.databinding.ItemBookBinding

class BestViewHolder(
    private val binding: ItemBookBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(item: ResponseBookData) {
        binding.tvBookId.text = item.id.toString()
        binding.tvBookName.text = item.title
        Glide.with(binding.root.context)
            .load(item.imageUrl)
            .into(binding.ivBookCover)
        binding.tvBookAuthor.text = item.author
        binding.tvBookCompletion.text = "${item.completionRate}%"
        binding.tvBookReadingtime.text = "${item.readingTime}분"
        val rankChange = item.rankChange
        val rankChangeText = when {
            rankChange == null -> "New"
            rankChange == 0 -> "-"
            rankChange > 0 -> "+${rankChange}"
            else -> rankChange.toString()
        }
        binding.tvRanking.text = rankChangeText


    }
}
