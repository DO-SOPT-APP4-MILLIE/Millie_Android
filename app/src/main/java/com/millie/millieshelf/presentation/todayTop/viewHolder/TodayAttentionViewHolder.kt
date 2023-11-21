package com.millie.millieshelf.presentation.todayTop.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemTodayAttentionBinding
import com.millie.millieshelf.model.TodayTopModel
import com.millie.millieshelf.presentation.todayTop.attention.TodayAttentionAdapter
import com.millie.millieshelf.presentation.todayTop.bookmark.TodayBookmarkAdapter

class TodayAttentionViewHolder(private val binding: ItemTodayAttentionBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayTopModel.Attention) =
        with(binding) {
            val toolbar = contentTodayAttentionTitle
            toolbar.tvContentTitleWithRightArrowTitle.text = todayData.title

            rvTodayAttention.apply {
                adapter = TodayAttentionAdapter(context)
                (adapter as TodayAttentionAdapter).submitList(todayData.attentionList)
            }
        }
}