package com.ppizil.rtcaapp.main

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("bind:setMainSavingAdapter")
fun setMainSavingAdapter(
    recyclerView: RecyclerView,
    adapter: ListAdapter<*, *>
) {
    recyclerView.run {
        layoutManager = LinearLayoutManager(recyclerView.context).apply {
            orientation = RecyclerView.VERTICAL
        }
        this.adapter = adapter
        //setHasFixedSize(true)
    }
}