package com.millie.millieshelf.presentation.todaybottom

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.databinding.ItemFooterInfoBinding

class TodayFooterAdapter(private var infoList: List<String>) :
    RecyclerView.Adapter<TodayFooterAdapter.TodayFooterViewHolder>() {

    inner class TodayFooterViewHolder(private val binding: ItemFooterInfoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val footerText = binding.tvFooterInfo
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): TodayFooterViewHolder {
        val binding =
            ItemFooterInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodayFooterViewHolder(binding)
    }

    override fun getItemCount(): Int = infoList.size

    override fun onBindViewHolder(
        holder: TodayFooterViewHolder,
        position: Int,
    ) {
        holder.footerText.text = infoList[position]
    }
}
