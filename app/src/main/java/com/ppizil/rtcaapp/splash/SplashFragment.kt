package com.ppizil.rtcaapp.splash

import android.os.Handler
import android.os.Looper
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.databinding.FragmentSplashBinding
import androidx.navigation.fragment.findNavController
import com.ppizil.rtcaapp.main.MainFragment


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
            goDestinationFragment(R.id.action_fragment_splash_to_fragment_main)
        }, 1000)
    }

}