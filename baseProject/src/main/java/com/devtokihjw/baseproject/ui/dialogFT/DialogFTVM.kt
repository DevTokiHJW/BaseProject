package com.devtokihjw.baseproject.ui.dialogFT

import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseproject.BaseApplication
import com.devtokihjw.baseproject.ui.BaseVM

abstract class DialogFTVM(baseApplication: BaseApplication) : BaseVM(baseApplication) {

    val dismissValue = MutableLiveData<Boolean?>()

    fun clearDismissValue() {
        dismissValue.value = null
    }
}