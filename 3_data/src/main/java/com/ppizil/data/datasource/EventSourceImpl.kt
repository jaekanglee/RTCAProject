package com.ppizil.data.datasource

import com.ppizil.data.model.EventDataModel
import com.ppizil.data.service.EventDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class EventSourceImpl @Inject constructor(
    private val eventDao: EventDao
) : EventSource {

    override  fun getEventList(): Flow<List<EventDataModel>> {
        return eventDao.getEventList()
    }

    override  fun insertEventItem(item: EventDataModel) {
        eventDao.insertEventItem(item)
    }

}