package com.devtokihjw.baseproject.ui.viewHolder

import android.content.Context
import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<D : ViewHolderData>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun onBindViewHolder(data: D, itemClickListener: (Context, Int, D) -> Unit)

    fun getString(resId: Int) = itemView.context.getString(resId)
}