package com.devtokihjw.baseproject.ui.ft

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseproject.ui.BaseVM

abstract class BaseFT<VH : FTVM>(contentLayoutId: Int) : Fragment(contentLayoutId) {

    abstract val vm: VH

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
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

    inline fun <reified VH : BaseVM> findVM() = ViewModelProvider(requireActivity())[VH::class.java]
}