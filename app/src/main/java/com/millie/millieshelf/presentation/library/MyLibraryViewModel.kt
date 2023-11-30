package com.millie.millieshelf.presentation.library

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

    fun getBookCollections() {
        ServicePool.bookService.getBookCollections()
            .enqueue(object : Callback<BaseResponse<List<BookCollections>>> {
                override fun onResponse(
                    call: Call<BaseResponse<List<BookCollections>>>,
                    response: Response<BaseResponse<List<BookCollections>>>
                ) {
                    if (response.isSuccessful) {
                        bookCollectionsLiveData.value = response.body()
                    }
                }

                override fun onFailure(
                    call: Call<BaseResponse<List<BookCollections>>>,
                    t: Throwable
                ) {
                    TODO("Not yet implemented")
                }

            })
    }

}
