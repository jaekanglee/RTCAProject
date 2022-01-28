package com.ppizil.rtcaapp.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.ppizil.rtcaapp.base.BaseHolder
import com.ppizil.rtcaapp.base.BaseListAdapter
import com.ppizil.rtcaapp.base.BaseModel
import com.ppizil.rtcaapp.base.EmptyHolder
import com.ppizil.rtcaapp.databinding.ItemEmptyBinding
import com.ppizil.rtcaapp.databinding.ItemSavingListBinding
import com.ppizil.rtcaapp.main.model.EventPresentModel

class EventListAdapter(
    private val savingHolderAction: SavingHolderAction
) : BaseListAdapter<EventPresentModel, BaseHolder<BaseModel>>(diffUtils) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<BaseModel> {
        return if (!isEmtpy) {
            EventHolder(
                ItemSavingListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
        } else {
            EmptyHolder(
                ItemEmptyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: BaseHolder<BaseModel>, position: Int) {
        if (holder is EventHolder) {
            holder.onBind(getItem(position))
        } else {

        }
    }


    companion object {
        val diffUtils = object : DiffUtil.ItemCallback<EventPresentModel>() {
            override fun areItemsTheSame(
                oldItem: EventPresentModel,
                newItem: EventPresentModel
            ): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(
                oldItem: EventPresentModel,
                newItem: EventPresentModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

}