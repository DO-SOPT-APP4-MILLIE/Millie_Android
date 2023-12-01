package com.millie.millieshelf.presentation.library

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import coil.load
import com.millie.millieshelf.databinding.FragmentMylibraryBinding // 예시로 사용하는 바인딩 클래스

class MylibraryFragment : Fragment() {
    private var _binding: FragmentMylibraryBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<MyLibraryViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMylibraryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.bookCollectionsLiveData.observe(viewLifecycleOwner) {
            binding.tvEconomic.text = it.data[0].category
            binding.ivEconomic.load(it.data[0].book[0].thumbnail)

            binding.tvSelf.text = it.data[1].category
            binding.ivSelf1.load(it.data[1].book[0].thumbnail)
            binding.ivSelf2.load(it.data[1].book[1].thumbnail)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
