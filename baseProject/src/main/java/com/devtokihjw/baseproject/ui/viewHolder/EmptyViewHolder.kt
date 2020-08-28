package com.devtokihjw.baseproject.ui.viewHolder

import android.content.Context
import android.view.ViewGroup

class EmptyViewHolder(viewGroup: ViewGroup) : BaseViewHolder<EmptyViewHolderData>(viewGroup) {

    override fun onBindViewHolder(data: EmptyViewHolderData, itemClickListener: (Context, Int, EmptyViewHolderData) -> Unit) {

    }
}