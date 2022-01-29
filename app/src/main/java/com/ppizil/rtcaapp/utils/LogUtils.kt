package com.ppizil.rtcaapp.utils

import android.util.Log
import com.ppizil.rtcaapp.BuildConfig

fun Any?.makeLog(tag: String?) {
    val id = tag?.let {
        return@let it
    } ?: kotlin.run {
        return@run Thread.currentThread().stackTrace[3].run {
            "[${this.className}]->[${this.fileName}]->[${this.methodName}]"
        }
    }
    this?.let {
        if (BuildConfig.BUILD_TYPE == "debug") {
            Log.e(id, it.toString())
        }
    } ?: run {
        //Log.e(tag, "DATA IS NULL")
    }

}
