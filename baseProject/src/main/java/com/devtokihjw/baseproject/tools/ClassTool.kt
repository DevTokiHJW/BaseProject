package com.devtokihjw.baseproject.tools

import android.util.Log

var enableLog = true

fun printLog(tag: String, any: Any?) {
    if (enableLog) {
        Log.e(tag, "$any")
    }
}

fun Any?.isNotNull() = this != null