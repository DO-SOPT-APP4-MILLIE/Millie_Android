package com.millie.millieshelf.presentation.todayTop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
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
        //binding.rvTodayTop.layoutManager = ConstraintLayout()

        todayTopContentAdapter.submitList(viewModel.mockTodayList)
    }
}
