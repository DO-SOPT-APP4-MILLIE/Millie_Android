package com.millie.millieshelf.presentation.today

import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ActivityTodayBinding
import com.millie.millieshelf.presentation.library.MylibraryFragment

class TodayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTodayBinding
    private var isExpanded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickFabBtn()
        initBottomNavigation()
        checkIntent()
    }

    private fun checkIntent() {
        Log.d("TAG", "checkIntent: ${intent.getStringExtra("detail")}")
        intent.getStringExtra("detail")?.let {
            Log.d("TAG", "checkIntent: $it")
            binding.bnvToday.selectedItemId = R.id.menu_shelf
            navigateTo<MylibraryFragment>()
        }
    }

    private fun initBottomNavigation() {
        binding.bnvToday.selectedItemId = R.id.menu_feed
        supportFragmentManager.findFragmentById(R.id.fcv_today)
            ?: navigateTo<TodayFragment>()
        binding.bnvToday.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_feed -> navigateTo<TodayFragment>()
                R.id.menu_shelf -> navigateTo<MylibraryFragment>()
            }
            true
        }
    }

    private inline fun <reified T : Fragment> navigateTo() {
        supportFragmentManager.commit {
            replace<T>(R.id.fcv_today, T::class.simpleName)
        }
    }

    private fun clickFabBtn() {
        binding.fabMain.setOnClickListener {
            if (isExpanded) {
                binding.clFabAudiobook.visibility = View.VISIBLE
                binding.clFabStory.visibility = View.VISIBLE
                binding.clFabMillieroad.visibility = View.VISIBLE

                ObjectAnimator.ofFloat(binding.clFabAudiobook, "translationY", 0f).apply { start() }
                ObjectAnimator.ofFloat(binding.clFabMillieroad, "translationY", 0f)
                    .apply { start() }
                ObjectAnimator.ofFloat(binding.clFabStory, "translationY", 0f).apply { start() }
            } else {
                binding.clFabAudiobook.visibility = View.INVISIBLE
                binding.clFabStory.visibility = View.INVISIBLE
                binding.clFabMillieroad.visibility = View.INVISIBLE

                ObjectAnimator.ofFloat(binding.clFabAudiobook, "translationY", 360f)
                    .apply { start() }
                ObjectAnimator.ofFloat(binding.clFabMillieroad, "translationY", 180f)
                    .apply { start() }
                ObjectAnimator.ofFloat(binding.clFabStory, "translationY", 90f).apply { start() }
            }

            isExpanded = !isExpanded
        }
    }
}
