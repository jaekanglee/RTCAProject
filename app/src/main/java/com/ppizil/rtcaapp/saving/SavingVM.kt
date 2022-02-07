package com.ppizil.rtcaapp.saving

import com.ppizil.rtcaapp.base.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SavingVM : BaseViewModel<SavingState>(), SavingViewModel {
    private val _peopleCount = MutableStateFlow(0)
    val peopleCount: StateFlow<Int>
        get() = _peopleCount


    private val _pepleNameList = MutableStateFlow(ArrayList<String>())
    val pepleNampepleNameList: StateFlow<List<String>>
        get() = _pepleNameList


    override fun onClickPeplePlus() {
        val count = _peopleCount.value + 1
        _peopleCount.value = count
        addNameItemFromNameList()
    }

    fun addNameItemFromNameList() {
        _pepleNameList.value.run {
            add("Test")
            _pepleNameList.value = this
        }
    }

    fun deleteNameItemFromNameList(index : Int){
        _pepleNameList.value.run {
            removeAt(index)
            _pepleNameList.value = this
        }
    }

    override fun onClickDeletePeople(index: Int) {
        val count = _peopleCount.value
        if (count > 0) {
            _peopleCount.value = count - 1
        }
        deleteNameItemFromNameList(index)
    }

    override fun inputUserName(name: String, index: Int) {
        TODO("Not yet implemented")
    }

    override fun peopleCount(): Int = peopleCount.value


}


interface SavingViewModel {
    fun onClickPeplePlus()
    fun onClickDeletePeople(index: Int)
    fun inputUserName(name: String, index: Int)
    fun peopleCount(): Int

}