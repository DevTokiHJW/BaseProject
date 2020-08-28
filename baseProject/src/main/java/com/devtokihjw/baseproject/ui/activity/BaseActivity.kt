package com.devtokihjw.baseproject.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseproject.ui.BaseViewModel

abstract class BaseActivity(private val layoutResId: Int) : AppCompatActivity() {

    abstract val viewModel: BaseActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)
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

    inline fun <reified T : BaseViewModel> findViewModel() = ViewModelProvider(this)[T::class.java]
}