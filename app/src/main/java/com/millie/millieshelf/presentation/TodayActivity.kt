package com.millie.millieshelf.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ActivityTodayBinding

class TodayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTodayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        binding.bnvToday.selectedItemId = R.id.menu_feed
        supportFragmentManager.findFragmentById(R.id.fcv_today)
            ?: navigateTo<TodayBottomFragment>()
        binding.bnvToday.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_feed -> navigateTo<TodayBottomFragment>()
            }
            true
        }
    }

    private inline fun <reified T : Fragment> navigateTo() {
        supportFragmentManager.commit {
            replace<T>(R.id.fcv_today, T::class.simpleName)
        }
    }
}
