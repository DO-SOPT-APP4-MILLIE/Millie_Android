package com.millie.millieshelf.presentation.detail

import android.os.Bundle
import com.millie.millieshelf.R
import com.millie.millieshelf.base.BaseActivity
import com.millie.millieshelf.databinding.ActivityBookDetailBinding

class BookDetailActivity : BaseActivity<ActivityBookDetailBinding>({ ActivityBookDetailBinding.inflate(it) }) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {

    }
}
