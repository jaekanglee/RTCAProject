package com.ppizil.rtcaapp.main

import com.ppizil.rtcaapp.base.BaseState
import com.ppizil.rtcaapp.main.model.EventPresentModel

sealed class MainViewState : BaseState {
    data class SUCCESS(val list: List<EventPresentModel>) : MainViewState()
    data class CLICK(val item: EventPresentModel) : MainViewState()
    data class TOAST(val msg : String) : MainViewState()
    object ADDING : MainViewState()
    object DISMISS : MainViewState()
    object LOADING : MainViewState()

//    abstract fun testMethod()
}
