package com.ppizil.rtcaapp.main


import androidx.lifecycle.viewModelScope
import com.ppizil.domain.usecase.EventInsertUsecase
import com.ppizil.domain.usecase.FetchEventsUsecase
import com.ppizil.rtcaapp.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val eventInsertUsecase: EventInsertUsecase,
    private val fetchEventUsecase: FetchEventsUsecase
) : BaseViewModel<MainViewState>(), SavingHolderAction {

    private val _uiState = MutableStateFlow<MainViewState>(MainViewState.LOADING)
    val uiState: StateFlow<MainViewState>
        get() = _uiState


    init {
        fetchEventLIstAll()
    }


    override fun getItemListCount(): Int? {
        return null
    }

    fun fetchEventLIstAll() {
        viewModelScope.launch {
            fetchEventUsecase.fetchEventListAll()
                .map {
                    it.map {
                        it.mapToPResent()
                    }
                }
                .collect {
                    _uiState.value = MainViewState.SUCCESS(it)
                }
        }
    }


    fun clickAddingButton() {
        _uiState.value = MainViewState.ADDING
    }

}