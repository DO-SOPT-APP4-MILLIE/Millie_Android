package com.millie.millieshelf.presentation.detail

import android.os.Bundle
import androidx.activity.viewModels
import com.millie.millieshelf.base.BaseActivity
import com.millie.millieshelf.databinding.ActivityBookDetailBinding

class BookDetailActivity :
    BaseActivity<ActivityBookDetailBinding>({ ActivityBookDetailBinding.inflate(it) }) {
    private val viewModel by viewModels<BookDetailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getBookDetail()
        initViews()
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
}
