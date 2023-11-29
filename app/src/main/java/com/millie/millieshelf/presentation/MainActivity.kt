package com.millie.millieshelf.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.millie.millieshelf.R
import com.millie.millieshelf.data.api.ServicePool
import retrofit2.await

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
