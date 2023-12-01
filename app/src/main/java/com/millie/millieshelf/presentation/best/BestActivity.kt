package com.millie.millieshelf.presentation.best

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.millie.millieshelf.R
import com.millie.millieshelf.base.BaseActivity
import com.millie.millieshelf.data.api.ServicePool
import com.millie.millieshelf.databinding.ActivityBestBinding
import com.millie.millieshelf.model.response.TodayBest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BestActivity : BaseActivity<ActivityBestBinding>(ActivityBestBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        connectAdapter()

        val chipTotal = findViewById<Chip>(R.id.chip_total)
        chipTotal.isChecked = true
    }
    private fun connectAdapter(){
        val adapter = BestAdapter()
        binding.rvBooks.adapter = adapter
        getRecyclerView()
    }

    private fun getRecyclerView() {
        ServicePool.bookService.getBooks().enqueue(object : Callback<TodayBest> {
            override fun onResponse(
                call: Call<TodayBest>,
                response: Response<TodayBest>
            ) {
                if (response.isSuccessful) {
                    val data: TodayBest? = response.body()

                    data?.let {
                        val adapter = binding.rvBooks.adapter as? BestAdapter
                        adapter?.setBookList(it.data)
                    }
                } else {
                    Toast.makeText(this@BestActivity, "서버 에러 발생", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<TodayBest>, t: Throwable) {
                Toast.makeText(this@BestActivity, "네트워크 연결 실패", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
    }}
