package com.millie.millieshelf.presentation.todayTop.bookmark

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.millie.millieshelf.databinding.ItemTodayBookmarkContentBinding
import com.millie.millieshelf.model.TodayBookmarkModel
import com.millie.millieshelf.util.ItemDiffCallback

class TodayBookmarkAdapter(context: Context) :
    ListAdapter<TodayBookmarkModel, TodayBookmarkContentViewHolder>(
        TodayTopDiffCallback
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

    companion object {
        private val TodayTopDiffCallback =
            ItemDiffCallback<TodayBookmarkModel>(
                onItemsTheSame = { old, new -> old.title == new.title },
                onContentsTheSame = { old, new -> old == new }
            )
    }
}