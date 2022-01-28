package com.ppizil.data.datasource

import com.ppizil.data.model.EventDataModel
import kotlinx.coroutines.flow.Flow

interface EventSource {
     fun getEventList(): List<EventDataModel>

     fun getEventItem(id : Long) : EventDataModel

     fun insertEventItem(item: EventDataModel) : Long

}