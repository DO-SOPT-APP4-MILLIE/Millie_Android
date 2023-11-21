package com.millie.millieshelf.presentation.todayTop.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemTodayBestBinding
import com.millie.millieshelf.model.TodayTopModel

class TodayBestViwHolder(private val binding: ItemTodayBestBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayTopModel.Best) {
        val toolbarWithText = binding.contentTodayBestTitle
        val toolbar = toolbarWithText.contentContentTitle
        toolbarWithText.contentContentText.text = todayData.comment
        toolbar.tvContentTitleWithRightArrowTitle.text = todayData.title
    }
}
