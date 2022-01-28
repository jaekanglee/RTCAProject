package com.ppizil.domain.usecase

import com.ppizil.domain.model.EventDomainModel
import com.ppizil.domain.repository.EventRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchEventsUsecaseImpl @Inject constructor(
    private val repo: EventRepository
) : FetchEventsUsecase {
    override fun fetchEventListAll(): Flow<List<EventDomainModel>> {
        return repo.getEventList()
    }

    override fun fetchEventItem(id: Long): Flow<EventDomainModel> {
        return repo.getEventItem(id)
    }

}