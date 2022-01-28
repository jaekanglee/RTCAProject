package com.ppizil.rtcaapp.main

import com.ppizil.domain.usecase.EventInsertUsecase
import com.ppizil.rtcaapp.base.BaseViewModel
import com.ppizil.rtcaapp.base.getCurrentMethodName
import com.ppizil.rtcaapp.base.makeLog
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val eventInsertUsercase: EventInsertUsecase
) : BaseViewModel<MainViewState>() {

    init {
        makeLog(getCurrentMethodName(),"Test")
    }

}