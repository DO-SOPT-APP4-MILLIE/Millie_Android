package com.millie.millieshelf.presentation.todayTop.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemTodayAttentionBinding
import com.millie.millieshelf.model.TodayTopModel

class TodayAttentionViewHolder(private val binding: ItemTodayAttentionBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayTopModel.Attention) =
        with(binding) {
            // do something
        }
}