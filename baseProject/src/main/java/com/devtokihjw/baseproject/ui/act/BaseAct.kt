package com.devtokihjw.baseproject.ui.act

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.devtokihjw.baseproject.ui.BaseVM

abstract class BaseAct<VM : BaseActVM>(private val layoutResId: Int) : AppCompatActivity() {

    abstract val vm: VM

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

    inline fun <reified VM : BaseVM> findVM() = ViewModelProvider(this)[VM::class.java]
}