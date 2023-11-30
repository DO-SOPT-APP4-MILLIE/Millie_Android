package com.millie.millieshelf.Best.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.millie.millieshelf.Best.Data.ResponseBookData
import com.millie.millieshelf.databinding.ItemBookBinding

class BestAdapter : RecyclerView.Adapter<BestViewHolder>() {
    private val BestList = mutableListOf<ResponseBookData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestViewHolder {
        val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BestViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BestViewHolder, position: Int) {
        holder.onBind(BestList[position])
    }

    override fun getItemCount(): Int {
        return BestList.size
    }

    fun setBookList(userData: List<ResponseBookData>) {
        BestList.clear()
        BestList.addAll(userData)
        notifyDataSetChanged()
    }
}

