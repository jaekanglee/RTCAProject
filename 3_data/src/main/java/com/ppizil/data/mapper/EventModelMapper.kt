package com.ppizil.data.mapper

import com.ppizil.data.model.EventDataModel
import com.ppizil.domain.model.EventDomainModel

fun EventDataModel.mapToDomain(): EventDomainModel {
    return EventDomainModel(
        id = id,
        title = title ?: "-",
        contents = contents ?: "-",
        date = date
    )
}

fun EventDomainModel.mapToData(): EventDataModel {
    return EventDataModel(
        id = id,
        title = title,
        contents = contents,
        date = date
    )
}