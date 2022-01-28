package com.ppizil.data.repository

import com.ppizil.data.datasource.EventSource
import com.ppizil.data.mapper.mapToData
import com.ppizil.data.mapper.mapToDomain
import com.ppizil.domain.model.EventDomainModel
import com.ppizil.domain.repository.EventRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    private val dataSource: EventSource
) : EventRepository {
    override fun getEventList(): Flow<List<EventDomainModel>> {
        return flow {
            val result = dataSource.getEventList().map { item ->
                item.mapToDomain()
            }
            emit(result)
        }
            .flowOn(Dispatchers.IO)
    }

    override fun getEventItem(id: Long): Flow<EventDomainModel> {
        return flow {
            val result = dataSource.getEventItem(id).mapToDomain()
            emit(result)
        }.flowOn(Dispatchers.IO)
    }

    override fun insertEventItem(item: EventDomainModel): Flow<Long> {
        return flow {
            val result = dataSource.insertEventItem(item.mapToData())
            emit(result)
        }.flowOn(Dispatchers.IO)
    }

}