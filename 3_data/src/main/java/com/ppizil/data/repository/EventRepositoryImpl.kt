package com.ppizil.data.repository

import com.ppizil.data.datasource.EventSource
import com.ppizil.data.mapper.mapToData
import com.ppizil.data.mapper.mapToDomain
import com.ppizil.domain.model.EventDomainModel
import com.ppizil.domain.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    private val dataSource: EventSource
) : EventRepository {
    override  fun getEventList(): Flow<List<EventDomainModel>> {
        return dataSource.getEventList()
            .map { list ->
                list.map { item ->
                    item.mapToDomain()
                }
            }
    }

    override  fun insertEventItem(item: EventDomainModel){
        dataSource.insertEventItem(item.mapToData())
    }

}