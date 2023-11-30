package com.millie.millieshelf.Library

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.millie.millieshelf.Best.ServicePool
import com.millie.millieshelf.Library.Data.BookData
import com.millie.millieshelf.Library.Data.ResponseLibraryDto
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.millie.millieshelf.databinding.FragmentMylibraryBinding // 예시로 사용하는 바인딩 클래스

class Mylibrary : Fragment() {
    private var _binding: FragmentMylibraryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMylibraryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //getMylibraryView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    private fun getMylibraryView() {
//        ServicePool.libService.getBookList().enqueue(object : Callback<ResponseLibraryDto> {
//            override fun onResponse(
//                call: Call<ResponseLibraryDto>,
//                response: Response<ResponseLibraryDto>
//            ) {
//                if (response.isSuccessful) {
//                    val data: ResponseLibraryDto? = response.body()
//
//                    data?.let { responseLibData ->
//                        for (categoryData in responseLibData.data) {
//                            when (categoryData.category) {
//                                "경영" -> {
//                                    val bookData: BookData? =
//                                        categoryData.bookData.find { it.category == "경영" }
//                                    bookData?.let {
//                                        Glide.with(requireContext())
//                                            .load(it.thumbnail)
//                                            .into(binding.ivEconomic)
//                                    }
//                                }
//                                "자기계발" -> {
//                                    val bookData: BookData? =
//                                        categoryData.bookData.find { it.category == "자기계발" }
//                                    bookData?.let {
//                                        if (binding.ivSelf1.drawable != null) {
//                                            Glide.with(requireContext())
//                                                .load(it.thumbnail)
//                                                .into(binding.ivSelf2)
//                                        } else {
//                                            Glide.with(requireContext())
//                                                .load(it.thumbnail)
//                                                .into(binding.ivSelf1)
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                } else {
//                    Toast.makeText(requireContext(), "서버 에러 발생", Toast.LENGTH_SHORT).show()
//                }
//            }
//
//            override fun onFailure(call: Call<ResponseLibraryDto>, t: Throwable) {
//                Toast.makeText(requireContext(), "네트워크 연결 실패", Toast.LENGTH_SHORT).show()
//            }
//        })
//    }
}
