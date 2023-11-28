package com.millie.millieshelf.presentation.todayTop.best

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemTodayBestContentBinding
import com.millie.millieshelf.model.response.TodayBest

class TodayBestViewHolder(private val binding: ItemTodayBestContentBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(data: TodayBest.Data) =
        with(binding) {
            tvTodayBestRank.text = data.id.toString()
            //ivTodayBestBook.load(data.thumbnail)
            tvTodayBestBookName.text = data.title
            tvTodayBestBookAuthor.text = data.author
            tvTodayBestBookCompletionRate.text = data.completionRate.toString()
            tvTodayBestBookCompletionRate.text = R.string.BEST_PERCENT_TIME.toString()
        }

}
