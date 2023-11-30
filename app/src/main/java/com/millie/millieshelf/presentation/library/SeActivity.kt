package com.millie.millieshelf.presentation.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.millie.millieshelf.R
import com.millie.millieshelf.databinding.ActivitySeBinding

class SeActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}