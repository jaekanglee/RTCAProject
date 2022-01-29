package com.ppizil.rtcaapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ppizil.rtcaapp.base.BaseViewModel
import com.ppizil.rtcaapp.main.MainViewState
import com.ppizil.rtcaapp.utils.MutableEventFlow
import com.ppizil.rtcaapp.utils.asEventFlow
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityVm @Inject constructor() : BaseViewModel<MainActicityState>() {
    private val _isLoading = MutableStateFlow<MainActicityState>(MainActicityState.IDLE)
    val isLoading: StateFlow<Boolean>
        get() = MutableStateFlow(_isLoading.value == MainActicityState.LOADING)


    fun setUiState(state: MainActicityState) {
        viewModelScope.launch {
            _isLoading.value = (state)
        }
    }
}