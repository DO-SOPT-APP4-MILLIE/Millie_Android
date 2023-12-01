package com.millie.millieshelf.presentation.today.attention

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.millie.millieshelf.databinding.ItemTodayAttentionContentBinding
import com.millie.millieshelf.model.TodayAttentionModel
import com.millie.millieshelf.util.ItemDiffCallback

class TodayAttentionAdapter(context: Context) :
    ListAdapter<TodayAttentionModel, TodayAttentionContentViewHolder>(
        ItemDiffCallback<TodayAttentionModel>(
            onItemsTheSame = { old, new -> old.id == new.id },
            onContentsTheSame = { old, new -> old == new }
        )
    ) {
    private val inflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodayAttentionContentViewHolder {
        val binding = ItemTodayAttentionContentBinding.inflate(inflater, parent, false)
        return TodayAttentionContentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodayAttentionContentViewHolder, position: Int) {
        holder.onBind(currentList[position])
    }

    override fun getItemCount() = currentList.size
}
