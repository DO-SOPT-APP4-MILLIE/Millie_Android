package com.millie.millieshelf.presentation.today

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemOriginalChipBinding
import com.millie.millieshelf.domain.entity.CategoryChip

class TodayChipAdapter(private var chipList: List<CategoryChip>) :
    RecyclerView.Adapter<TodayChipAdapter.TodayOriginalChipViewHolder>() {

    inner class TodayOriginalChipViewHolder(private val binding: ItemOriginalChipBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val chipText = binding.tvOriginalChip
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): TodayOriginalChipViewHolder {
        val binding =
            ItemOriginalChipBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodayOriginalChipViewHolder(binding)
    }

    override fun getItemCount(): Int = chipList.size

    override fun onBindViewHolder(
        holder: TodayOriginalChipViewHolder,
        position: Int,
    ) {
        holder.chipText.text = chipList[position].title
        if (chipList[position].isSelected == true) {
            with(holder) {
                chipText.setBackgroundResource(R.drawable.rec_black_radius_16)
                chipText.setTextColor(ContextCompat.getColor(itemView.context, R.color.White))
            }
        }
    }
}
