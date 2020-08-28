package com.devtokihjw.baseproject.ui.dialogFragment

import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseproject.BaseApplication
import com.devtokihjw.baseproject.ui.BaseViewModel

class DialogFragmentViewModel(baseApplication: BaseApplication) : BaseViewModel(baseApplication) {

    val dismissValue = MutableLiveData<Boolean?>()

    fun clearDismissValue() {
        dismissValue.value = null
    }
}