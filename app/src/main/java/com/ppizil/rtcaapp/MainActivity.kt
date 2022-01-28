package com.ppizil.rtcaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ppizil.rtcaapp.base.BaseActivity
import com.ppizil.rtcaapp.databinding.ActivityMainBinding
import com.ppizil.rtcaapp.main.MainViewState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding,MainViewState>(R.layout.activity_main) {
    override fun viewBind() {

    }

    override fun setObserver() {

    }

    override fun initData() {

    }

    override fun onState(newState: MainViewState) {

    }


}