package com.ppizil.data.datasource

import com.ppizil.data.model.EventDataModel
import com.ppizil.data.service.EventDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class EventSourceImpl @Inject constructor(
    private val eventDao: EventDao
) : EventSource {

    override  fun getEventList(): List<EventDataModel> {
        return eventDao.getEventList()


    }

    override fun getEventItem(id: Long): EventDataModel {
        return eventDao.getEventItem(id)
    }


    override  fun insertEventItem(item: EventDataModel) : Long{
        return eventDao.insertEventItem(item)
    }

}