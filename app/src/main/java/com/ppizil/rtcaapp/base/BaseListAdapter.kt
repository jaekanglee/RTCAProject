package com.ppizil.rtcaapp.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BaseListAdapter<M, VH : RecyclerView.ViewHolder>(
    diffUtils: DiffUtil.ItemCallback<M>
) : ListAdapter<M, VH>(diffUtils) {
    var isEmtpy: Boolean = true

    override fun getItemCount(): Int {
        val size = super.getItemCount()

        return if (size == 0) {
            isEmtpy = true
            1
        } else {
            isEmtpy = false
            size
        }
    }
}