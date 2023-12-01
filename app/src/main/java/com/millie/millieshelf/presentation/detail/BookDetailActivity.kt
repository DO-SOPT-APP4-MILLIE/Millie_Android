package com.millie.millieshelf.presentation.detail

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.snackbar.Snackbar
import com.millie.millieshelf.R
import com.millie.millieshelf.base.BaseActivity
import com.millie.millieshelf.databinding.ActivityBookDetailBinding
import com.millie.millieshelf.presentation.today.TodayActivity

class BookDetailActivity :
    BaseActivity<ActivityBookDetailBinding>({ ActivityBookDetailBinding.inflate(it) }) {
    private val viewModel by viewModels<BookDetailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initObserve()
        initViews()
        initBottomButton()
    }

    private fun initObserve() {
        viewModel.bookPostState.observe(this) {
            when (it) {
                BookDetailViewModel.BookSaveState.SUCCESS -> {
                    Snackbar.make(binding.root, "저장되었습니다.", Snackbar.LENGTH_SHORT).apply {
                        setAction(R.string.my_library_btn) {
                            Intent(this@BookDetailActivity, TodayActivity::class.java).apply {
                                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                                putExtra("detail", "detail")
                            }.let(::startActivity)
                        }
                    }.show()
                }

                BookDetailViewModel.BookSaveState.FAIL -> {
                    Snackbar.make(binding.root, "저장에 실패했습니다.", Snackbar.LENGTH_SHORT).show()
                }

                BookDetailViewModel.BookSaveState.EARLIER -> {
                    Snackbar.make(binding.root, "이미 저장된 사진입니다.", Snackbar.LENGTH_SHORT).apply {
                        setAction(R.string.my_library_btn) {
                            Intent(this@BookDetailActivity, TodayActivity::class.java).apply {
                                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                                putExtra("detail", "detail")
                            }.let(::startActivity)
                        }
                    }.show()
                }
            }
        }
    }

    private fun initViews() {
        viewModel.bookDetailInfo.observe(this) {
            val storeCount = (it.archivedCount.toDouble()) / 10000
            with(binding) {
                tvBookTitle.text = it.title
                tvPostCount.text = "${it.postCount}개"
                tvBookAuthor.text = it.author
                tvReviewCount.text = "${it.reviewCount}개"
                tvBookStoreCount.text = "${storeCount}개+"
            }
        }
    }

    private fun initBottomButton() {
        binding.tvSaveBtn.setOnClickListener {
            DetailSaveDialogFragment().showAllowingStateLoss(supportFragmentManager, "save")
        }
    }
}
