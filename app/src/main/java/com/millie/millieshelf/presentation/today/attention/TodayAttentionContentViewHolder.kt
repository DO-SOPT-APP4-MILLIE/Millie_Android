package com.millie.millieshelf.presentation.today.attention

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemTodayAttentionContentBinding
import com.millie.millieshelf.model.TodayAttentionModel

class TodayAttentionContentViewHolder(private val binding: ItemTodayAttentionContentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayAttentionModel) =
        with(binding) {
            ivTodayAttentionContent.setImageResource(todayData.content)
        }
}
