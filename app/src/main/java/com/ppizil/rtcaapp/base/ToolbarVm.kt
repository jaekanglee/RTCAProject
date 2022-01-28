package com.ppizil.rtcaapp.base

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ppizil.rtcaapp.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ToolbarVmImpl @Inject constructor() : BaseViewModel<ToolbarState>(), ToolbarVm {

    private val _titleValue = MutableLiveData<String>()
    val titleValue: LiveData<String>
        get() = _titleValue

    private val _titleColor = MutableLiveData<Int>()
    val titleColor: LiveData<Int>
        get() = _titleColor


    private val _onClickLeftBtn = MutableLiveData<Event<Boolean>>()
    val onClickLeftBtn: LiveData<Event<Boolean>>
        get() = _onClickLeftBtn


    private val _onClickRightBtn = MutableLiveData<Event<Boolean>>()
    val onClickRightBtn: LiveData<Event<Boolean>>
        get() = _onClickRightBtn
//
//    private val _toolbarBgResource = MutableLiveData(R.color.colorBlue)
//    val toolbarBgResource: LiveData<Int>
//        get() = _toolbarBgResource


    private val _visibleStateLeftMenu = MutableLiveData(View.VISIBLE)
    val visibleStateLeftMenu: LiveData<Int>
        get() = _visibleStateLeftMenu

    private val _visibleStateRightMenu = MutableLiveData(View.VISIBLE)
    val visibleStateRightMenu: LiveData<Int>
        get() = _visibleStateRightMenu


    private val _leftMenuIcon = MutableLiveData<Int>()
    val leftMenuIcon : LiveData<Int>
        get() = _leftMenuIcon

    private val _rightMenuIcon = MutableLiveData<Int>()
    val rightMenuIcon : LiveData<Int>
        get() = _rightMenuIcon

    private val _visibleStateToolbar = MutableLiveData(View.VISIBLE)
    val visibleStateToolbar: LiveData<Int>
        get() = _visibleStateToolbar


    override fun onClickLeftBtn() {
        _onClickLeftBtn.value = Event(true)
    }

    override fun onClickRightBtn() {
        _onClickRightBtn.value = Event(true)
    }

    override fun onClickTitleText() {

    }

    override fun setToolbarBackGroundColor(color: Int) {

    }
//
//    override fun setToolbarBackGroundColor(color: Int) {
//        _toolbarBgResource.value = color
//    }

    override fun setPageTitle(data: String?) {
        data?.let {
            _titleValue.value = it
        }
    }

    override fun setVisibleStateLeftMenu(state: Boolean) {
        when (state) {
            true -> {
                _visibleStateLeftMenu.value = View.VISIBLE
            }
            else -> {
                _visibleStateLeftMenu.value = View.GONE
            }
        }

    }

    override fun setLeftMenuIncon(id: Int) {
        _leftMenuIcon.value=id
    }

    override fun setRigthMenuIncon(id: Int) {
        _rightMenuIcon.value=id
    }

    override fun setVisibleStateToolbar(state: Boolean) {
        when(state){
            true->{
                _visibleStateToolbar.value= View.VISIBLE
            }
            else ->{
                _visibleStateToolbar.value= View.GONE
            }
        }

    }

    override fun setTitleTextColor(colorId: Int) {
        _titleColor.value=colorId
    }

    override fun setVisibleStateRightMenu(state: Boolean) {
        when (state) {
            true -> {
                _visibleStateRightMenu.value = View.VISIBLE
            }
            else -> {
                _visibleStateRightMenu.value = View.GONE
            }
        }
    }

}

interface ToolbarVm {
    fun onClickLeftBtn()
    fun onClickRightBtn()
    fun onClickTitleText()
    fun setToolbarBackGroundColor(color: Int)
    fun setPageTitle(data: String?)
    fun setVisibleStateRightMenu(state: Boolean)
    fun setVisibleStateLeftMenu(state: Boolean)
    fun setLeftMenuIncon(id:Int)
    fun setRigthMenuIncon(id:Int)
    fun setVisibleStateToolbar(state:Boolean)
    fun setTitleTextColor(colorId : Int)
}


sealed class ToolbarState : BaseState {
    object SHOW : ToolbarState()
    object HID : ToolbarState()
}
