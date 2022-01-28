package com.ppizil.rtcaapp.main

import com.ppizil.data.model.EventDataModel
import com.ppizil.domain.mapper.BaseMapper
import com.ppizil.domain.model.EventDomainModel
import com.ppizil.rtcaapp.main.model.EventPresentModel

fun EventDomainModel.mapToPResent(): EventPresentModel {
    return EventPresentModel(
        id = id,
        title = title,
        contents = contents,
        date = date
    )
}