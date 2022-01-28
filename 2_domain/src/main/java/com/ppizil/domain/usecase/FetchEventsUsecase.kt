package com.ppizil.domain.usecase

import com.ppizil.domain.model.EventDomainModel
import kotlinx.coroutines.flow.Flow

interface FetchEventsUsecase {
    fun fetchEventListAll(): Flow<List<EventDomainModel>>
    fun fetchEventItem(id : Long) : Flow<EventDomainModel>
}