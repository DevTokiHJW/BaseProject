package com.devtokihjw.baseproject.ui

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseproject.BaseApplication

abstract class BaseVM(val baseApplication: BaseApplication) : AndroidViewModel(baseApplication) {

    val snackBarValue = MutableLiveData<String?>()

    fun clearSnackBarValue() {
        snackBarValue.value = null
    }

    fun getString(resId: Int) = baseApplication.getString(resId)
}