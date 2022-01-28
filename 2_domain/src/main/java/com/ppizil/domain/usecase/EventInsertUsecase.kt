package com.ppizil.domain.usecase

import com.ppizil.domain.model.EventDomainModel

interface EventInsertUsecase {
    fun insertEventItem(item: EventDomainModel)
}