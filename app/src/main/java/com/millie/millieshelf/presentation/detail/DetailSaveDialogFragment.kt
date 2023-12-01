package com.millie.millieshelf.presentation.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.activityViewModels
import com.millie.millieshelf.base.BaseViewBindingDialogFragment
import com.millie.millieshelf.databinding.DialogDetailSaveBinding

class DetailSaveDialogFragment : BaseViewBindingDialogFragment<DialogDetailSaveBinding>() {
    private val activityViewModel by activityViewModels<BookDetailViewModel>()
    override fun setBinding(layoutInflater: LayoutInflater): DialogDetailSaveBinding {
        return DialogDetailSaveBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onResume() {
        super.onResume()
        context?.let {
            dialogWidthPercent(it, dialog)
        }
    }

    private fun initViews() {
        binding.tvSave.setOnClickListener {
            activityViewModel.postArchiveBook()
            dismissAllowingStateLoss()
        }
    }
}
