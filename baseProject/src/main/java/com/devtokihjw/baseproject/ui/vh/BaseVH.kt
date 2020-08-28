package com.devtokihjw.baseproject.ui.vh

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.devtokihjw.baseproject.data.VHData

abstract class BaseVH<Data : VHData>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun onBindViewHolder(data: Data, itemClickListener: (Context, Int, Data) -> Unit)

    fun getString(resId: Int) = itemView.context.getString(resId)
}