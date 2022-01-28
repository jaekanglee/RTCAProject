package com.ppizil.data.datasource

import com.ppizil.data.model.EventDataModel
import kotlinx.coroutines.flow.Flow

interface EventSource {
     fun getEventList(): Flow<List<EventDataModel>>

     fun insertEventItem(item: EventDataModel)

}