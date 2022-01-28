package com.ppizil.rtcaapp.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.ppizil.rtcaapp.databinding.ItemSavingListBinding
import com.ppizil.rtcaapp.main.SavingHolder

abstract class BaseHolder<T>(
    private val binding: ViewBinding
) : RecyclerView.ViewHolder(binding.root) {
    abstract fun onBind(item: T)
    abstract fun recycle()

}