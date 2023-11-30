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
    private var _originalChipAdapter: TodayChipAdapter? = null
    private var _originalBookAdapter: TodayOriginalBookAdapter? = null
    private var _weeklyTasteChipAdapter: TodayChipAdapter? = null
    private var _weeklyTasteBookAdapter: TodayWeeklyTasteAdapter? = null
    private var _footerAdapter: TodayFooterAdapter? = null

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentTodayBottomBinding = FragmentTodayBottomBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setInitAdapter()
    }

    private fun setInitAdapter() {
        initMonthlyAdapter()
        initOriginalAdapter()
        initWeeklyTasteAdapter()
        initFooterAdapter()
    }

    private fun initMonthlyAdapter() {
        _todayMonthlyAdapter = TodayMonthlyAdapter()
        _todayMonthlyAdapter?.submitList(viewModel.monthlyList)
        binding.rcvMonthlyBook.adapter = _todayMonthlyAdapter
    }

    private fun initOriginalAdapter() {
        _originalChipAdapter = TodayChipAdapter(viewModel.originalChipList)
        _originalBookAdapter = TodayOriginalBookAdapter(viewModel.millieOriginalList)
        with(binding) {
            rcvOriginalChip.adapter = _originalChipAdapter
            vpOriginalBook.adapter = _originalBookAdapter
        }
    }

    private fun initWeeklyTasteAdapter() {
        _weeklyTasteChipAdapter = TodayChipAdapter(viewModel.weeklyTasteChipList)
        _weeklyTasteBookAdapter = TodayWeeklyTasteAdapter(viewModel.weeklyTasteBookList)
        with(binding) {
            rcvWeeklyTasteChip.adapter = _weeklyTasteChipAdapter
            rcvWeeklyTasteBook.adapter = _weeklyTasteBookAdapter
        }
    }

    private fun initFooterAdapter() {
        _footerAdapter = TodayFooterAdapter(viewModel.footerInfoList)
        binding.rcvTodayFooter.adapter = _footerAdapter
    }
}
