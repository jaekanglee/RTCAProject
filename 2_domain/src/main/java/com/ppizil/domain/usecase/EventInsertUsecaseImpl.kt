package com.ppizil.domain.usecase

import com.ppizil.domain.model.EventDomainModel
import com.ppizil.domain.repository.EventRepository
import javax.inject.Inject

class EventInsertUsecaseImpl @Inject constructor(
    private val eventRepository: EventRepository
) : EventInsertUsecase {

    override fun insertEventItem(item: EventDomainModel)  {
        eventRepository.insertEventItem(item)
    }

}