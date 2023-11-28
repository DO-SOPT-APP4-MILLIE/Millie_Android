package com.millie.millieshelf.presentation.todayTop

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.millie.millieshelf.base.BaseFragment
import com.millie.millieshelf.databinding.FragmentTodayTopBinding
import com.millie.millieshelf.presentation.todayTop.attention.TodayAttentionAdapter
import com.millie.millieshelf.presentation.todayTop.best.TodayBestAdapter
import com.millie.millieshelf.presentation.todayTop.bookmark.TodayBookmarkAdapter
import com.millie.millieshelf.util.CustomSnapHelper

class TodayTopFragment : BaseFragment<FragmentTodayTopBinding>() {
    private val viewModel by viewModels<TodayTopViewModel>()
    private lateinit var bookmarkAdapter: TodayBookmarkAdapter
    private lateinit var bestAdapter: TodayBestAdapter
    private lateinit var bestSnapHelper: LinearSnapHelper

    private lateinit var attentionAdapter: TodayAttentionAdapter
    private lateinit var attentionSnapHelper: PagerSnapHelper

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTodayTopBinding = FragmentTodayTopBinding.inflate(inflater, container, false)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        initBookmarkAdapter()
        initBestAdapter()
        initAttentionAdapter()
    }

    private fun initBookmarkAdapter(){
        bookmarkAdapter = TodayBookmarkAdapter(requireContext())
        bookmarkAdapter.submitList(viewModel.mockTodayBookmarkList)
        binding.rvTodayBookmark.adapter = bookmarkAdapter
    }

    private fun initBestAdapter(){
        bestAdapter = TodayBestAdapter(requireContext())
        bestAdapter.submitList(viewModel.mockTodayBestList)

        bestSnapHelper = CustomSnapHelper()
        bestSnapHelper.attachToRecyclerView(binding.rvTodayBest)
        binding.rvTodayBest.adapter = bestAdapter
    }

    private fun initAttentionAdapter(){
        attentionAdapter = TodayAttentionAdapter(requireContext())
        attentionAdapter.submitList(viewModel.mockTodayAttentionList)
        attentionSnapHelper = PagerSnapHelper()

        attentionSnapHelper.attachToRecyclerView(binding.rvTodayAttention)
        binding.rvTodayAttention.adapter = attentionAdapter
    }

}
