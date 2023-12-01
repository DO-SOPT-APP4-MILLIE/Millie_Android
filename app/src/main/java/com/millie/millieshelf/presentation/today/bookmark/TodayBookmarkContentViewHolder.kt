package com.millie.millieshelf.presentation.today.bookmark

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemTodayBookmarkContentBinding
import com.millie.millieshelf.model.TodayBookmarkModel

class TodayBookmarkContentViewHolder(private val binding: ItemTodayBookmarkContentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayBookmarkModel) =
        with(binding) {
            ibTodayBookmarkButton.setImageResource(todayData.icon)
            tvTodayBookmarkTitle.text = todayData.title
        }
}
