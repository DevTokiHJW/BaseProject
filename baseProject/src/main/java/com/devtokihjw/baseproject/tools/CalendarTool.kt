package com.devtokihjw.baseproject.tools

import java.text.SimpleDateFormat
import java.util.*

fun Long.formatyyyyMMddHHmmss() = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@formatyyyyMMddHHmmss }.time)

fun Long.formatyyyyMMdd() = SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@formatyyyyMMdd }.time)

fun Long.formatHHmmss() = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@formatHHmmss }.time)

fun Long.formatHHmm() = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Calendar.getInstance().apply { timeInMillis = this@formatHHmm }.time)