package com.millie.millieshelf.presentation.todayTop

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.millie.millieshelf.base.BaseFragment
import com.millie.millieshelf.databinding.FragmentTodayTopBinding
import com.millie.millieshelf.presentation.todayTop.attention.TodayAttentionAdapter
import com.millie.millieshelf.presentation.todayTop.bookmark.TodayBookmarkAdapter

class TodayTopFragment : BaseFragment<FragmentTodayTopBinding>() {
    private val viewModel by viewModels<TodayTopViewModel>()
    private lateinit var bookmarkAdapter: TodayBookmarkAdapter
    lateinit var attentionAdapter: TodayAttentionAdapter

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
        initAttentionAdapter()
    }

    private fun initBookmarkAdapter(){
        bookmarkAdapter = TodayBookmarkAdapter(requireContext())
        bookmarkAdapter.submitList(viewModel.mockTodayBookmarkList)
        binding.rvTodayBookmark.adapter = bookmarkAdapter

    }

    private fun initAttentionAdapter(){
        attentionAdapter = TodayAttentionAdapter(requireContext())
        attentionAdapter.submitList(viewModel.mockTodayAttentionList)
        binding.rvTodayAttention.adapter = attentionAdapter
    }
}
