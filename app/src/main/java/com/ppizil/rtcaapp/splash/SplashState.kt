package com.ppizil.rtcaapp.splash

import com.ppizil.rtcaapp.base.BaseState

sealed class SplashState : BaseState {
    object  LOADING : SplashState()
    object  DISMISS : SplashState()
    object  NEXT_PAGE : SplashState()
}
