package com.millie.millieshelf.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemMonthlyBookBinding
import com.millie.millieshelf.domain.entity.Book
import com.millie.millieshelf.util.ItemDiffCallback

class TodayMonthlyAdapter :
    ListAdapter<Book, TodayMonthlyAdapter.TodayMonthlyViewHolder>(
        ItemDiffCallback<Book>(
            onContentsTheSame = { old, new -> old == new },
            onItemsTheSame = { old, new -> old.title == new.title },
        ),
    ) {

    inner class TodayMonthlyViewHolder(private val binding: ItemMonthlyBookBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: Book) {
            with(binding) {
                ivMonthlyMain.setImageResource(data.image)
                tvMonthlyTitle.text = data.title
                tvMonthlyAuthor.text = data.author
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): TodayMonthlyViewHolder {
        val binding =
            ItemMonthlyBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodayMonthlyViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: TodayMonthlyViewHolder,
        position: Int,
    ) {
        holder.onBind(
            getItem(position) as Book,
        )
    }
}
