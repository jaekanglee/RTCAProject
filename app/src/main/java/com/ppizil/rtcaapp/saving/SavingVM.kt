package com.ppizil.rtcaapp.saving

import com.ppizil.rtcaapp.base.BaseViewModel
import com.ppizil.rtcaapp.utils.makeLog
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SavingVM : BaseViewModel<SavingState>(), SavingViewModel {

    private val _peopleList = MutableStateFlow(ArrayList<String>())
    val peopleList: StateFlow<List<String>>
        get() = _peopleList

    private val _peopleCount = MutableStateFlow(0)
    val peopleCount: StateFlow<Int>
        get() = _peopleCount


    private val _groupName = MutableStateFlow<String?>(null)
    val groupName: StateFlow<String?>
        get() = _groupName


    private val _totalMoney = MutableStateFlow<String?>(null)
    val totalMoney: StateFlow<String?>
        get() = _totalMoney


    override fun onClickPeplePlus() {
        _peopleList.value.add("")
        syncPeopleCount()
    }


    fun syncPeopleCount() {
        _peopleCount.value = _peopleList.value.size
    }

    override fun onClickDeletePeople(index: Int) {
        _peopleList.value.removeAt(index)
        syncPeopleCount()
    }

    override fun inputUserName(name: String, index: Int) {
        _peopleList.value.run {
            removeAt(index)
            add(index, name)
            toString().makeLog(null)
        }

    }

    override fun inputTotalMoney(money: String) {
        _totalMoney.value = money
    }

    override fun inputGroupName(name: String) {
        _groupName.value = name
    }


    fun saveRtcaInfo(){
        checkValidField()
    }

    fun checkValidField(){
        if(_groupName.value.isNullOrEmpty()){
            "GroupName Error".makeLog(null)
            return
        }

        if(_totalMoney.value.isNullOrEmpty()){
            "Money Error".makeLog(null)
            return
        }

    }
}


interface SavingViewModel {
    fun onClickPeplePlus()
    fun onClickDeletePeople(index: Int)
    fun inputUserName(name: String, index: Int)
    fun inputTotalMoney(money: String)
    fun inputGroupName(name: String)
}