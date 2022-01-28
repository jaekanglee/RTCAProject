package com.ppizil.rtcaapp.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.ppizil.rtcaapp.base.BaseHolder
import com.ppizil.rtcaapp.base.BaseModel
import com.ppizil.rtcaapp.base.EmptyHolder
import com.ppizil.rtcaapp.databinding.ItemEmptyBinding
import com.ppizil.rtcaapp.databinding.ItemSavingListBinding
import com.ppizil.rtcaapp.main.model.SavingModel

class SavingListAdapter(
    private val savingHolderAction: SavingHolderAction
) : ListAdapter<SavingModel, BaseHolder<BaseModel>>(diffUtils) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<BaseModel> {
        return if (viewType == ITEMS) {
             SavingHolder(
                ItemSavingListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
        } else {
             EmptyHolder(
                ItemEmptyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: BaseHolder<BaseModel>, position: Int) {
        if (holder is SavingHolder) {
            holder.onBind(getItem(position))
        } else {

        }
    }

    override fun getItemViewType(position: Int): Int {
        savingHolderAction.getItemListCount().run {
            return if (this == 0 || this == null) {
                EMPTY
            } else {
                ITEMS
            }
        }
    }

    companion object {
        val diffUtils = object : DiffUtil.ItemCallback<SavingModel>() {
            override fun areItemsTheSame(oldItem: SavingModel, newItem: SavingModel): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: SavingModel, newItem: SavingModel): Boolean {
                return oldItem == newItem
            }
        }

        const val EMPTY = 0
        const val ITEMS = 1
    }

}