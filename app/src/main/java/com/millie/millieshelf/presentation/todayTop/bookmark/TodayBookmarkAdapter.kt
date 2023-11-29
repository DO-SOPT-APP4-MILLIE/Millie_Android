package com.millie.millieshelf.presentation.todayTop.bookmark

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.millie.millieshelf.databinding.ItemTodayBookmarkContentBinding
import com.millie.millieshelf.model.TodayBookmarkModel
import com.millie.millieshelf.util.ItemDiffCallback

class TodayBookmarkAdapter(context: Context) :
    ListAdapter<TodayBookmarkModel, TodayBookmarkContentViewHolder>(
        ItemDiffCallback<TodayBookmarkModel>(
            onContentsTheSame = {old, new -> old == new},
            onItemsTheSame = {old, new -> old.title == new.title}
        )
    ) {
    private val inflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodayBookmarkContentViewHolder {
        val binding = ItemTodayBookmarkContentBinding.inflate(inflater, parent, false)
        return TodayBookmarkContentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodayBookmarkContentViewHolder, position: Int) {
        holder.onBind(currentList[position])
    }

    override fun getItemCount() = currentList.size
}
