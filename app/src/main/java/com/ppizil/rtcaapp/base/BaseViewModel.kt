package com.ppizil.rtcaapp.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.cancel


abstract class BaseViewModel<S : BaseState> : ViewModel() {

    override fun onCleared() {
        viewModelScope.cancel()
        super.onCleared()
    }
}

