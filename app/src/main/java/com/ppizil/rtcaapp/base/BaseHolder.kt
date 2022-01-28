package com.ppizil.rtcaapp.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseHolder<T>(
    private val binding: ViewBinding
) : RecyclerView.ViewHolder(binding.root) {
    abstract fun onBind(item: T)
    abstract fun recycle()

}