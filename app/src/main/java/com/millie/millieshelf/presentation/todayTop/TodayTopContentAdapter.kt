package com.millie.millieshelf.presentation.todayTop

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.millie.millieshelf.databinding.ItemTodayAttentionBinding
import com.millie.millieshelf.databinding.ItemTodayBestBinding
import com.millie.millieshelf.databinding.ItemTodayBookmarkBinding
import com.millie.millieshelf.databinding.ItemTodayImgBannerBinding
import com.millie.millieshelf.model.TodayTopModel
import com.millie.millieshelf.presentation.todayTop.viewHolder.TodayAttentionViewHolder
import com.millie.millieshelf.presentation.todayTop.viewHolder.TodayBannerViewHolder
import com.millie.millieshelf.presentation.todayTop.viewHolder.TodayBestViwHolder
import com.millie.millieshelf.presentation.todayTop.viewHolder.TodayBookmarkViewHolder
import com.millie.millieshelf.util.ItemDiffCallback

class TodayTopContentAdapter(context: Context) : ListAdapter<TodayTopModel, ViewHolder>(
    TodayTopDiffCallback
) {
    private val inflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        when (viewType) {
            BANNER -> {
                val binding = ItemTodayImgBannerBinding.inflate(inflater, parent, false)
                TodayBannerViewHolder(binding)
            }

            BOOKMARK -> {
                val binding = ItemTodayBookmarkBinding.inflate(inflater, parent, false)
                TodayBookmarkViewHolder(binding)
            }

            BEST -> {
                val binding = ItemTodayBestBinding.inflate(inflater, parent, false)
                TodayBestViwHolder(binding)
            }

            else -> { // Attention
                val binding = ItemTodayAttentionBinding.inflate(inflater, parent, false)
                TodayAttentionViewHolder(binding)
            }
        }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = currentList[position]

        when (holder) {
            is TodayBannerViewHolder -> holder.onBind(item as TodayTopModel.Banner)
            is TodayBookmarkViewHolder -> holder.onBind(item as TodayTopModel.Bookmark)
            is TodayBestViwHolder -> holder.onBind(item as TodayTopModel.Best)
            is TodayAttentionViewHolder -> holder.onBind(item as TodayTopModel.Attention)
        }
    }

    override fun getItemCount() = currentList.size

    override fun getItemViewType(position: Int) =
        when (currentList[position]) {
            is TodayTopModel.Banner -> BANNER
            is TodayTopModel.Bookmark -> BOOKMARK
            is TodayTopModel.Best -> BEST
            is TodayTopModel.Attention -> ATTENTION
        }

    companion object {
        private const val BANNER = 1
        private const val BOOKMARK = 2
        private const val BEST = 3
        private const val ATTENTION = 4

        private val TodayTopDiffCallback =
            ItemDiffCallback<TodayTopModel>(
                onItemsTheSame = { old, new -> old.type == new.type },
                onContentsTheSame = { old, new -> old == new }
            )
    }
}