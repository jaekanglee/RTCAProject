package com.ppizil.rtcaapp.main

import com.ppizil.rtcaapp.base.BaseState

sealed class MainViewState : BaseState {
    object  DISMISS : MainViewState()
    object  LOADING : MainViewState()
}
