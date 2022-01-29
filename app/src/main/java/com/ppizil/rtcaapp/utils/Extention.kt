package com.ppizil.rtcaapp.utils

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

fun LifecycleOwner.repeatOnStarted(block: suspend CoroutineScope.() -> Unit) {
    lifecycleScope.launch {
        lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED, block)
    }
}


fun Context.shortToast(msg : String){
    Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}

fun Context.longToast(msg : String){
    Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
}

fun Context.toastFromStringId(stringId: Int){
    Toast.makeText(this,stringId,Toast.LENGTH_LONG).show()
}