package com.ppizil.rtcaapp.main.model

import com.ppizil.rtcaapp.base.BaseModel

data class EventPresentModel(
    val id: Long,
    val title: String,
    val contents: String,
    val date: Long
) : BaseModel
