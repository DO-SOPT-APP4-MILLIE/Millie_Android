package com.millie.millieshelf.presentation.todayTop.best

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.millie.millieshelf.databinding.ItemTodayBestContentBinding
import com.millie.millieshelf.model.response.TodayBest
import com.millie.millieshelf.util.ItemDiffCallback

class TodayBestAdapter(context: Context) :
    ListAdapter<TodayBest.Data, TodayBestViewHolder>(
        TodayBestDiffCallback
    ) {
    private val inflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayBestViewHolder {
        val binding = ItemTodayBestContentBinding.inflate(inflater, parent, false)
        return TodayBestViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodayBestViewHolder, position: Int) {
        holder.onBind(currentList[position])
    }

    override fun getItemCount(): Int = currentList.size


    companion object {
        private val TodayBestDiffCallback =
            ItemDiffCallback<TodayBest.Data>(
                onItemsTheSame = { old, new -> old.id == new.id },
                onContentsTheSame = { old, new -> old == new }
            )
    }
}
