package com.devtokihjw.baseproject.ui.bottomSheetDialogFT

import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseproject.BaseApplication
import com.devtokihjw.baseproject.ui.BaseVM

abstract class BottomSheetDialogFTVM(baseApplication: BaseApplication) : BaseVM(baseApplication) {

    val dismissValue = MutableLiveData<Boolean?>()

    fun clearDismissValue() {
        dismissValue.value = null
    }
}