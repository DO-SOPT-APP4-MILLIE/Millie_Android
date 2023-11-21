package com.millie.millieshelf.presentation.todayTop.viewHolder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ItemTodayImgBannerBinding
import com.millie.millieshelf.model.TodayTopModel

class TodayBannerViewHolder(private val binding: ItemTodayImgBannerBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun onBind(todayData: TodayTopModel.Banner) =
        with(binding) {
            //ivTodayImgBanner.
//            ivTodayImgBanner.load(R.drawable.iv_today_img_banner) {
//                error(R.drawable.img_error)
//                placeholder(R.drawable.img_placeholder)
//            }
        }
}