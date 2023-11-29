package com.millie.millieshelf.Best

import android.os.Bundle
import android.widget.Toast
import com.millie.millieshelf.Best.Data.ResponseBookDto
import com.millie.millieshelf.base.BaseActivity
import com.millie.millieshelf.databinding.ActivityBestBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BestActivity : BaseActivity<ActivityBestBinding>(ActivityBestBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        connectAdapter()
    }
    private fun connectAdapter(){
        val adapter = BestAdapter()
        binding.rvBooks.adapter = adapter
        getRecyclerView()
    }

    private fun getRecyclerView() {
        ServicePool.authService.getBookList().enqueue(object : Callback<ResponseBookDto> {
            override fun onResponse(
                call: Call<ResponseBookDto>,
                response: Response<ResponseBookDto>
            ) {
                if (response.isSuccessful) {
                    val data: ResponseBookDto? = response.body()

                    data?.let {
                        val adapter = binding.rvBooks.adapter as? BestAdapter
                        adapter?.setBookList(it.data)
                    }
                } else {
                    Toast.makeText(this@BestActivity, "서버 에러 발생", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ResponseBookDto>, t: Throwable) {
                Toast.makeText(this@BestActivity, "네트워크 연결 실패", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}



