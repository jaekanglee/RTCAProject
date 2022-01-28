package com.ppizil.rtcaapp.main


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.ppizil.domain.usecase.EventInsertUsecase
import com.ppizil.rtcaapp.base.BaseViewModel
import com.ppizil.rtcaapp.base.Event
import com.ppizil.rtcaapp.base.getCurrentMethodName
import com.ppizil.rtcaapp.base.makeLog
import com.ppizil.rtcaapp.main.model.SavingModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val eventInsertUsercase: EventInsertUsecase
) : BaseViewModel<MainViewState>(), SavingHolderAction {

    init {
        makeLog(getCurrentMethodName(), "Test")
    }


    private val _savingContentsList = MutableLiveData<Event<ArrayList<SavingModel>>>()
    val savingContentsList: LiveData<Event<List<SavingModel>>>
        get() = Transformations.map(_savingContentsList) {
            it
        }


    init {
        SavingModel(
            id = 1,
            title = "Test"
        ).run {
            ArrayList<SavingModel>().apply {
                add(this@run)
                _savingContentsList.value = Event(this)
            }
        }
    }

    override fun getItemListCount(): Int? {
        return savingContentsList.value?.peekContent()?.count()
    }
}