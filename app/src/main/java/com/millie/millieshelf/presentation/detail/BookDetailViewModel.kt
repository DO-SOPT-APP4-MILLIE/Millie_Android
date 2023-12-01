package com.millie.millieshelf.presentation.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.millie.millieshelf.data.api.ServicePool.bookService
import com.millie.millieshelf.data.model.BaseResponse
import com.millie.millieshelf.data.model.BookDetail
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BookDetailViewModel : ViewModel() {
    private val _bookDetailInfo = MutableLiveData<BookDetail>()
    val bookDetailInfo: LiveData<BookDetail>
        get() = _bookDetailInfo

    fun getBookDetail() {
        bookService.getBook(1).enqueue(object : Callback<BaseResponse<BookDetail>> {
            override fun onResponse(
                call: Call<BaseResponse<BookDetail>>,
                response: Response<BaseResponse<BookDetail>>,
            ) {
                if (response.isSuccessful) {
                    val data: BookDetail = response.body()!!.data
                    _bookDetailInfo.value = data
                }
            }

            override fun onFailure(call: Call<BaseResponse<BookDetail>>, t: Throwable) {
                Log.e("detail", "failure:: ${t.message}")
            }
        })
    }
}
