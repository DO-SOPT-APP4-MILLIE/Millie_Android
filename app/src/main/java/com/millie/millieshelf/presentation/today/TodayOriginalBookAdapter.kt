package com.millie.millieshelf.presentation.today

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemOriginalBookBinding
import com.millie.millieshelf.domain.entity.OriginalBook

class TodayOriginalBookAdapter(private var bookList: List<OriginalBook>) :
    RecyclerView.Adapter<TodayOriginalBookAdapter.TodayOriginalBookViewHolder>() {

    inner class TodayOriginalBookViewHolder(private val binding: ItemOriginalBookBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: OriginalBook) {
            with(binding) {
                ivOriginalBookThumbnail.setImageResource(data.image)
                tvOriginalBookTitle.text = data.title
                tvOriginalBookAuthor.text = data.author
                tvOriginalBookDesc.text = data.description
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): TodayOriginalBookViewHolder {
        val binding =
            ItemOriginalBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodayOriginalBookViewHolder(binding)
    }

    override fun getItemCount(): Int = bookList.size

    override fun onBindViewHolder(
        holder: TodayOriginalBookViewHolder,
        position: Int,
    ) {
        holder.onBind(
            bookList[position],
        )
    }
}
