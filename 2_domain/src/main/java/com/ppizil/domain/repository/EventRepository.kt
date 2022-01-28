package com.ppizil.domain.repository

import com.ppizil.domain.model.EventDomainModel
import kotlinx.coroutines.flow.Flow

interface EventRepository {
    fun getEventList(): Flow<List<EventDomainModel>>

    fun insertEventItem(item: EventDomainModel)
}