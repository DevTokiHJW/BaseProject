package com.devtokihjw.baseproject.ui.dialogFT

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseproject.ui.BaseVM

abstract class BaseDialogFT<VH : DialogFTVM>(private val layoutResId: Int) : DialogFragment() {

    abstract val vm: VH

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setOnClickListener()
    }

    override fun onStart() {
        super.onStart()
        observe()
    }

    override fun onResume() {
        super.onResume()
        setWindow()
    }

    override fun onStop() {
        super.onStop()
        removeObserver()
    }

    private fun setWindow() {
        dialog?.window?.let { mWindow ->
            val mLayoutParams = mWindow.attributes
            mLayoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
            mLayoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
            mWindow.attributes = mLayoutParams
        }
    }

    abstract fun setOnClickListener()

    abstract fun observe()

    abstract fun removeObserver()

    inline fun <reified VH : BaseVM> findVM() = ViewModelProvider(requireActivity())[VH::class.java]
}