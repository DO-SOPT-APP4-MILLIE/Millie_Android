package com.millie.millieshelf.presentation.today

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearSnapHelper
import com.millie.millieshelf.base.BaseFragment
import com.millie.millieshelf.databinding.FragmentTodayBinding
import com.millie.millieshelf.presentation.best.BestActivity
import com.millie.millieshelf.presentation.today.attention.TodayAttentionAdapter
import com.millie.millieshelf.presentation.today.best.TodayBestAdapter
import com.millie.millieshelf.presentation.today.bookmark.TodayBookmarkAdapter
import com.millie.millieshelf.util.CustomSnapHelper
import com.millie.millieshelf.util.EdgeMarginItemDecoration
import com.millie.millieshelf.util.dpToPx

class TodayFragment : BaseFragment<FragmentTodayBinding>() {
    private val viewModel by viewModels<TodayViewModel>()
    private lateinit var bookmarkAdapter: TodayBookmarkAdapter
    private lateinit var bestAdapter: TodayBestAdapter
    private lateinit var bestSnapHelper: LinearSnapHelper
    private lateinit var attentionAdapter: TodayAttentionAdapter
    private var _todayMonthlyAdapter: TodayMonthlyAdapter? = null
    private var _originalChipAdapter: TodayChipAdapter? = null
    private var _originalBookAdapter: TodayOriginalBookAdapter? = null
    private var _weeklyTasteChipAdapter: TodayChipAdapter? = null
    private var _weeklyTasteBookAdapter: TodayWeeklyTasteAdapter? = null
    private var _footerAdapter: TodayFooterAdapter? = null

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentTodayBinding = FragmentTodayBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setInitAdapter()

        viewModel.todayBestList.observe(viewLifecycleOwner) {
            bestAdapter.submitList(it)
        }

        viewModel.getTodayBestList()
    }

    private fun setInitAdapter() {
        initBookmarkAdapter()
        initBestAdapter()
        initAttentionAdapter()
        initMonthlyAdapter()
        initOriginalAdapter()
        initWeeklyTasteAdapter()
        initFooterAdapter()
    }

    private fun initBookmarkAdapter() {
        bookmarkAdapter = TodayBookmarkAdapter(
            context = requireContext(),
            onClick = {
                Log.d("millie", "TodayFragment - initBookmarkAdapter() : $it")
                if (it.title.contains("베스트")) {
                    Intent(requireContext(), BestActivity::class.java).apply {
                        startActivity(this)
                    }
                }
            },
        )
        bookmarkAdapter.submitList(viewModel.mockTodayBookmarkList)

        binding.rvTodayBookmark.addItemDecoration(
            EdgeMarginItemDecoration(
                edgeMargin = 24.dpToPx,
                itemMargin = 16.dpToPx,
            ),
        )
        binding.rvTodayBookmark.adapter = bookmarkAdapter
    }

    private fun initBestAdapter() {
        bestAdapter = TodayBestAdapter(requireContext())
        bestSnapHelper = CustomSnapHelper()
        bestSnapHelper.attachToRecyclerView(binding.rvTodayBest)
        binding.rvTodayBest.adapter = bestAdapter
    }

    private fun initAttentionAdapter() {
        attentionAdapter = TodayAttentionAdapter(requireContext())
        attentionAdapter.submitList(viewModel.mockTodayAttentionList)

        binding.rvTodayAttention.addItemDecoration(
            EdgeMarginItemDecoration(
                edgeMargin = 24.dpToPx,
                itemMargin = 12.dpToPx,
            ),
        )
        binding.rvTodayAttention.adapter = attentionAdapter
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
