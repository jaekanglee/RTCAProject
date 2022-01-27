package com.ppizil.rtcaapp.base

import android.os.Looper
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


abstract class BaseViewModel : ViewModel() {

    private val _progressVisibleState = MutableLiveData(View.GONE)
    val progressVisibleState: LiveData<Int>
        get() = _progressVisibleState


    private val _clickBackBtn = MutableLiveData<Event<Boolean>>()
    val clickBackBtn: LiveData<Event<Boolean>>
        get() = _clickBackBtn


    private val _exception = MutableLiveData<Event<Throwable>>()
    val exception: LiveData<Event<Throwable>>
        get() = _exception

    init {

    }



    private val _toastMsg = MutableLiveData<Event<Any>>()
    val toastMsg: LiveData<Event<Any>>
        get() = _toastMsg


    fun setToastMsg(msg: Any?) {
        msg?.let {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                _toastMsg.value = Event(it)
            } else {
                _toastMsg.postValue(Event(it))
            }
        }
    }

    fun setException(e: Throwable) {
        setProgressVisibleState(false)
        _exception.value= Event(e)
    }

    fun isOnlyNullCheck(vararg items: Any?) {
        var index = 0
        items.forEach {
            if (it == null) {
                throw NullPointerException("NullPointException AnyType item number :  ${index}  ")
            }
            index++
        }
    }

    fun isOnlyEmptyString(vararg items: String?) {
        var index = 0
        items.forEach {
            if (it?.isEmpty() == true) {
                throw EmptyException("EmptyException [String] item number :  ${index}  ")
            }
            index++
        }
    }

    fun isNullFromLivedata(vararg items: MutableLiveData<*>) {
        var index = 0
        items.forEach {
            if (it.value == null) {
                throw NullPointerException("NullPointException [String LiveData]item number :  ${index}  ")
            }
            index++
        }
    }

    fun isOnlyEmptyStringLivedata(vararg items: LiveData<*>) {
        var index = 0
        items.forEach {
            if (it.value is String) {
                if ((it.value as String).isEmpty()) {
                    throw EmptyException("EmptyException item number :  ${index}  ")
                }
                index++
            }

        }
    }

    fun getMethodName(): String = Thread.currentThread().stackTrace[3].methodName

    fun onClickBackBtn() {
//        onClickTrottleAction {
//            _clickBackBtn.value = Event(true)
//        }
    }


    fun setProgressVisibleState(value: Boolean) {
        makeLog(
            getCurrentMethodName(),
            Thread.currentThread().name
        )
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (value) {
                _progressVisibleState.value = (View.VISIBLE)
            } else {
                _progressVisibleState.value = (View.GONE)
            }
        } else {
            if (value) {
                _progressVisibleState.postValue(View.VISIBLE)
            } else {
                _progressVisibleState.postValue(View.GONE)
            }
        }

    }
}

class EmptyException(message: String?) : Exception(message) {
}
