package com.millie.millieshelf.presentation.todayTop

import android.os.Bundle
import com.millie.millieshelf.R
import com.millie.millieshelf.base.BaseActivity
import com.millie.millieshelf.databinding.ActivityTodayTopBinding

class TodayTopActivity : BaseActivity<ActivityTodayTopBinding>({ ActivityTodayTopBinding.inflate(it)}) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        connectFragemnt()
    }

    private fun connectFragemnt() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fcv_home)
        if (currentFragment == null) {

            supportFragmentManager.beginTransaction()
                .add(R.id.fcv_home, TodayTopFragment())
                .commit()
        }
    }
}