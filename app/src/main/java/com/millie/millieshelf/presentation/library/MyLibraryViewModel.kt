package com.millie.millieshelf.presentation.library

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.millie.millieshelf.data.api.ServicePool
import com.millie.millieshelf.data.model.BaseResponse
import com.millie.millieshelf.data.model.BookCollections
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyLibraryViewModel : ViewModel() {
    val bookCollectionsLiveData = MutableLiveData<BaseResponse<List<BookCollections>>>()
    init {
        getBookCollections()
    }
    fun getBookCollections() {
        ServicePool.bookService.getBookCollections()
            .enqueue(object : Callback<BaseResponse<List<BookCollections>>> {
                override fun onResponse(
                    call: Call<BaseResponse<List<BookCollections>>>,
                    response: Response<BaseResponse<List<BookCollections>>>
                ) {
                    if (response.isSuccessful) {
                        bookCollectionsLiveData.value = response.body()
                        Log.d("my",bookCollectionsLiveData.value.toString())
                    }
                }

                override fun onFailure(
                    call: Call<BaseResponse<List<BookCollections>>>,
                    t: Throwable
                ) {
                    Log.d("my","fail : ${t.message}")
                }

            })
    }

}
