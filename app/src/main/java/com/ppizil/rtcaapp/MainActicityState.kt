package com.ppizil.rtcaapp

import com.ppizil.rtcaapp.base.BaseState

sealed class MainActicityState :BaseState {
    object LOADING : MainActicityState()
    object DISMISS : MainActicityState()
    object IDLE : MainActicityState()
}