package com.millie.millieshelf.presentation.todayTop.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemTodayBookmarkBinding
import com.millie.millieshelf.model.TodayTopModel
import com.millie.millieshelf.presentation.todayTop.bookmark.TodayBookmarkAdapter
import com.millie.millieshelf.presentation.todayTop.bookmark.TodayBookmarkViewModel

class TodayBookmarkViewHolder(private val binding: ItemTodayBookmarkBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayTopModel.Bookmark) {
        val toolbar = binding.contentTodayBookmarkTitle
        toolbar.tvContentTitleWithRightArrowTitle.text = todayData.title

        binding.rvTodayBookmark.apply {
            adapter = TodayBookmarkAdapter(context)
            (adapter as TodayBookmarkAdapter).submitList(TodayBookmarkViewModel().mockTodayBookmarkList)
        }
    }
}