package com.millie.millieshelf.presentation.today

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemWeeklyTasteBookBinding
import com.millie.millieshelf.domain.entity.Book

class TodayWeeklyTasteAdapter(private var bookList: List<Book>) :
    RecyclerView.Adapter<TodayWeeklyTasteAdapter.TodayWeeklyTasteViewHolder>() {

    inner class TodayWeeklyTasteViewHolder(private val binding: ItemWeeklyTasteBookBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var completelyReadInfo = binding.clWeeklyTasteDesc
        fun onBind(data: Book) {
            with(binding) {
                ivWeeklyThumbnail.setImageResource(data.image)
                tvWeeklyTasteTitle.text = data.title
                tvWeeklyTasteAuthor.text = data.author
                "${data.completelyReadRate}% | ${data.completelyReadTime}분".also {
                    tvWeeklyPlusPercent.text = it
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): TodayWeeklyTasteViewHolder {
        val binding =
            ItemWeeklyTasteBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodayWeeklyTasteViewHolder(binding)
    }

    override fun getItemCount(): Int = bookList.size

    override fun onBindViewHolder(
        holder: TodayWeeklyTasteViewHolder,
        position: Int,
    ) {
        holder.onBind(
            bookList[position],
        )
        if (bookList[position].completelyReadRate == null || bookList[position].completelyReadTime == null) {
            holder.completelyReadInfo.visibility = View.INVISIBLE
        }
    }
}
