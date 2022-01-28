package com.ppizil.rtcaapp.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class EmptyHolder(
    private val binding: ViewDataBinding
) : BaseHolder<BaseModel>(binding) {


    override fun recycle() {

    }

    override fun onBind(item: BaseModel) {

    }

}