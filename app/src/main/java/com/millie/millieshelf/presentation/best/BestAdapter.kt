package com.millie.millieshelf.presentation.best

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.millie.millieshelf.databinding.ItemBookBinding
import com.millie.millieshelf.model.response.TodayBest
import com.millie.millieshelf.util.ItemDiffCallback

class BestAdapter(
    private val onClick: (TodayBest.Data) -> Unit,
) : ListAdapter<TodayBest.Data, BestViewHolder>(
    ItemDiffCallback<TodayBest.Data>(
        onItemsTheSame = { old, new -> old == new },
        onContentsTheSame = { old, new -> old.title == new.title },
    ),
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestViewHolder {
        val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BestViewHolder(
            binding = binding,
            onClick = onClick,
        )
    }

    override fun onBindViewHolder(holder: BestViewHolder, position: Int) {
        holder.onBind(currentList[position])
    }
}
