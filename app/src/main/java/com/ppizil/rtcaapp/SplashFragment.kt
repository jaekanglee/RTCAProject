package com.ppizil.rtcaapp

import android.content.Intent
import android.os.Handler
import android.os.Looper
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>(R.layout.fragment_splash) {
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
}