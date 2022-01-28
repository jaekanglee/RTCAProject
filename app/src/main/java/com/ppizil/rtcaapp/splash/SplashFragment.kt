package com.ppizil.rtcaapp.splash

import android.os.Handler
import android.os.Looper
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding,SplashState>(R.layout.fragment_splash) {
    override fun bindView() {

    }

    override fun setObserver() {

    }

    override fun initData() {
        startNextMainpage()
    }


    fun startNextMainpage(){
        Handler(Looper.getMainLooper()).postDelayed({
            goDestinationFragment(R.id.fragment_main)
        }, 1000)
    }

    override fun onState(newState: SplashState) {

    }
}