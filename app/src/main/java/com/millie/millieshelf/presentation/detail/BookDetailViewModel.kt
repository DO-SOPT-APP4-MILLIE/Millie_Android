package com.millie.millieshelf.presentation.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.millie.millieshelf.data.api.ServicePool.bookService
import com.millie.millieshelf.data.model.BaseResponse
import com.millie.millieshelf.data.model.BookDetail
import com.millie.millieshelf.model.response.PostArchiveResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BookDetailViewModel : ViewModel() {
    enum class BookSaveState {
        SUCCESS,
        FAIL,
        EARLIER,
    }

    private val _bookDetailInfo = MutableLiveData<BookDetail>()
    val bookDetailInfo: LiveData<BookDetail>
        get() = _bookDetailInfo

    val bookPostState = MutableLiveData<BookSaveState>()

    init {
        getBookDetail()
    }

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

    fun postArchiveBook() {
        bookService.postArchiveBook(bookId = "1").enqueue(object : Callback<PostArchiveResponse> {
            override fun onResponse(call: Call<PostArchiveResponse>, response: Response<PostArchiveResponse>) {
                Log.d("DetailViewModel", "success:: ${response.code()}")
                when {
                    response.isSuccessful -> {
                        bookPostState.value = BookSaveState.SUCCESS
                    }
                    response.code() == 400 -> {
                        bookPostState.value = BookSaveState.EARLIER
                    }
                    else -> {
                        bookPostState.value = BookSaveState.FAIL
                    }
                }
            }

            override fun onFailure(call: Call<PostArchiveResponse>, t: Throwable) {
                Log.e("DetailViewModel", "failure:: ${t.message}")
                bookPostState.value = BookSaveState.FAIL
            }
        })
    }
}
