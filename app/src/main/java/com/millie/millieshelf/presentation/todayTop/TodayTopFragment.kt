package com.millie.millieshelf.presentation.todayTop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.millie.millieshelf.base.BaseFragment
import com.millie.millieshelf.databinding.FragmentTodayTopBinding

class TodayTopFragment : BaseFragment<FragmentTodayTopBinding>() {
    private val viewModel by viewModels<TodayTopViewModel>()

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTodayTopBinding = FragmentTodayTopBinding.inflate(inflater, container, false)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val todayTopContentAdapter = TodayTopContentAdapter(requireContext())
        binding.rvTodayTop.adapter = todayTopContentAdapter

        todayTopContentAdapter.submitList(viewModel.mockTodayList)
    }
}
