package com.ppizil.rtcaapp.main


import androidx.lifecycle.viewModelScope
import com.ppizil.domain.usecase.EventInsertUsecase
import com.ppizil.domain.usecase.FetchEventsUsecase
import com.ppizil.rtcaapp.base.BaseViewModel
import com.ppizil.rtcaapp.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val eventInsertUsecase: EventInsertUsecase,
    private val fetchEventUsecase: FetchEventsUsecase
) : BaseViewModel<MainViewState>(), SavingHolderAction {

    private val _uiState = MutableSharedFlow<Event<MainViewState>>()
    val uiState: MutableSharedFlow<Event<MainViewState>>
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
                    _uiState.emit(Event(MainViewState.SUCCESS(it)))
                }
        }
    }


     fun clickAddingButton() {
        viewModelScope.launch {
            _uiState.emit(Event(MainViewState.ADDING))
        }
    }
}