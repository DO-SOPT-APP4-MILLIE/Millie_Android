package com.millie.millieshelf.presentation.todaybottom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.millie.millieshelf.base.BaseFragment
import com.millie.millieshelf.databinding.FragmentTodayBottomBinding

class TodayBottomFragment : BaseFragment<FragmentTodayBottomBinding>() {
    private val viewModel by activityViewModels<TodayBottomViewModel>()
    private var _todayMonthlyAdapter: TodayMonthlyAdapter? = null
    private var _originalChipAdapter: TodayOriginalChipAdapter? = null
    private var _originalBookAdapter: TodayOriginalBookAdapter? = null

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentTodayBottomBinding = FragmentTodayBottomBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initMonthlyAdapter()
        initOriginalAdapter()
    }

    private fun initMonthlyAdapter() {
        _todayMonthlyAdapter = TodayMonthlyAdapter()
        _todayMonthlyAdapter?.submitList(viewModel.monthlyList)
        binding.rcvMonthlyBook.adapter = _todayMonthlyAdapter
    }

    private fun initOriginalAdapter() {
        _originalChipAdapter = TodayOriginalChipAdapter(viewModel.originalChipList)
        _originalBookAdapter = TodayOriginalBookAdapter(viewModel.millieOriginalList)
        with(binding) {
            rcvOriginalChip.adapter = _originalChipAdapter
            vpOriginalBook.adapter = _originalBookAdapter
            vpOriginalBook.isNestedScrollingEnabled = false
        }
    }
}
