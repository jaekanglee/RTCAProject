package com.ppizil.rtcaapp.base

import android.util.Log
import com.ppizil.rtcaapp.BuildConfig

fun makeLog(tag: String, msg: String?) {

    msg?.let {
        if (BuildConfig.BUILD_TYPE == "debug") {
            Log.e(tag, msg)
        } else {

        }
    } ?: run {
        //Log.e(tag, "DATA IS NULL")
    }

}

fun getCurrentMethodName(): String {
    return Thread.currentThread().stackTrace[3].methodName
}
