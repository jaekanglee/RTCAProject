package com.ppizil.rtcaapp.main

import androidx.fragment.app.viewModels
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding,MainViewState>(R.layout.fragment_main) {

    private val viewModel : MainViewModel by viewModels()

    override fun bindView() {
    }

    override fun setObserver() {

    }

    override fun initData() {
    }

    override fun onState(newState: MainViewState) {

    }
}