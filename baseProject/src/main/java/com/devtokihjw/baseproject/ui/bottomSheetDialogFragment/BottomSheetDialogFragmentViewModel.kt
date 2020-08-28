package com.devtokihjw.baseproject.ui.bottomSheetDialogFragment

import androidx.lifecycle.MutableLiveData
import com.devtokihjw.baseproject.BaseApplication
import com.devtokihjw.baseproject.ui.BaseViewModel

abstract class BottomSheetDialogFragmentViewModel(baseApplication: BaseApplication) : BaseViewModel(baseApplication) {

    val dismissValue = MutableLiveData<Boolean?>()

    fun clearDismissValue() {
        dismissValue.value = null
    }
}