package com.millie.millieshelf.base

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.Point
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowInsets
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding

abstract class BaseViewBindingDialogFragment<B : ViewBinding> : DialogFragment() {

    private var _binding: B? = null
    open val binding: B get() = _binding!!
    val bindingInitialized: Boolean
        get() = _binding != null && isAdded

    abstract fun setBinding(layoutInflater: LayoutInflater): B

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = getInflatedLayout(layoutInflater).root

    private fun getInflatedLayout(inflater: LayoutInflater): B = setBinding(inflater).also { _binding = it }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAutoCleared()
    }

    override fun onResume() {
        super.onResume()
        setLayoutFullScreen()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    fun init() {
        initDialogBaseSetting()
    }

    private fun initAutoCleared() {
        lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onCreate(owner: LifecycleOwner) {
                viewLifecycleOwnerLiveData.observe(this@BaseViewBindingDialogFragment) { viewLifecycleOwner ->
                    viewLifecycleOwner?.lifecycle?.addObserver(object : DefaultLifecycleObserver {
                        override fun onDestroy(owner: LifecycleOwner) {
                            Log.e("BaseViewBindingDialog", "Dialog onDestroy, auto cleared ( dismiss )")
                            try {
                                if (isAdded) {
                                    _binding = null
                                    this@BaseViewBindingDialogFragment.dismissAllowingStateLoss()
                                }
                            } catch (e: Exception) {
                                Log.e("BaseViewBindingDialog", "dismissAllowingStateLoss, dialogFragment is Not Added")
                            }
                        }
                    })
                }
            }
        })
    }

    private fun initDialogBaseSetting() {
        dialog?.run {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setCanceledOnTouchOutside(false)
        }
    }

    fun safeDismissAllowingStateLoss() {
        try {
            if (isAdded) {
                dismissAllowingStateLoss()
            }
        } catch (e: Exception) {
            Log.e("BaseViewBindingDialog", "dismissAllowingStateLoss, dialogFragment is Not Added")
        }
    }

    private fun setLayoutFullScreen() {
        dialog?.run {
            window?.run {
                setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
        }
    }

    fun initDialogViewSize(width: Int = 0, height: Int = 0) = dialog?.window?.setLayout(width, height)

    fun showAllowingStateLoss(fm: FragmentManager, tag: String = "") {
        fm.beginTransaction().add(this, tag)
            .commitAllowingStateLoss()
    }

    fun dialogWidthPercent(context: Context, dialog: Dialog?, percent: Double = 0.8) {
        val deviceSize = getDeviceSize(context)
        dialog?.window?.run {
            val params = attributes
            params.width = (deviceSize[0] * percent).toInt()
            attributes = params
        }
    }

    private fun getDeviceSize(context: Context): IntArray {
        val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val windowMetrics = windowManager.currentWindowMetrics
            val windowInsets = windowMetrics.windowInsets

            val insets = windowInsets.getInsetsIgnoringVisibility(
                WindowInsets.Type.navigationBars() or WindowInsets.Type.displayCutout()
            )
            val insetsWidth = insets.right + insets.left
            val insetsHeight = insets.top + insets.bottom

            val bounds = windowMetrics.bounds

            return intArrayOf(bounds.width() - insetsWidth, bounds.height() - insetsHeight)
        } else {
            val display = windowManager.defaultDisplay
            val size = Point()

            display?.getSize(size)

            return intArrayOf(size.x, size.y)
        }
    }
}