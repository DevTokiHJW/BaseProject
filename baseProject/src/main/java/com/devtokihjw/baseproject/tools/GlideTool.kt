package com.devtokihjw.baseproject.tools

import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions

@GlideModule
class GlideTool : AppGlideModule()

fun AppCompatImageView.loadCircleCropTransform(url: String) {
    GlideApp.with(context)
            .load(url)
            .apply(RequestOptions.circleCropTransform())
            .into(this)
}

fun AppCompatImageView.loadUrl(url: String) {
    GlideApp.with(context)
            .load(url)
            .into(this)
}