package com.ppizil.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "eventModel")
data class EventDataModel(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String?,
    val contents: String?,
    val date: Long
)