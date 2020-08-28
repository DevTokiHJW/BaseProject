package com.devtokihjw.baseproject.ui.bottomSheetDialogFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseproject.R
import com.devtokihjw.baseproject.ui.BaseViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetDialogFragment(private val layoutResId: Int) : BottomSheetDialogFragment() {

    abstract val viewModel: BottomSheetDialogFragmentViewModel

    private val bottomSheetCallback by lazy {
        object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> dismiss() // 不在畫面上時，關掉SheetDialogFragment
                    else -> {
                    }
                }
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        BottomSheetBehavior.from(requireDialog().findViewById<FrameLayout>(R.id.design_bottom_sheet)).run {
            state = BottomSheetBehavior.STATE_EXPANDED
            peekHeight = 0
            addBottomSheetCallback(bottomSheetCallback)
        }
        setOnClickListener()
    }

    override fun onStart() {
        super.onStart()
        observe()
    }

    override fun onStop() {
        super.onStop()
        removeObserver()
    }

    abstract fun setOnClickListener()

    abstract fun observe()

    abstract fun removeObserver()

    inline fun <reified T : BaseViewModel> findViewModel() = ViewModelProvider(requireActivity())[T::class.java]
}