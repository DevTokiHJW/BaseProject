package com.devtokihjw.baseproject.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseproject.ui.BaseViewModel

abstract class BaseFragment(contentLayoutId: Int) : Fragment(contentLayoutId) {

    abstract val viewModel: FragmentViewModel

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

    inline fun <reified T : BaseViewModel> findViewModel() = ViewModelProvider(requireActivity())[T::class.java]
}