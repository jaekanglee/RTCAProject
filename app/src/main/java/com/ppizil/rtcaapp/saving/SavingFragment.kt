package com.ppizil.rtcaapp.saving

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.databinding.FragmentSavingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SavingFragment : BaseFragment<FragmentSavingBinding, SavingState>(R.layout.fragment_saving) {

    private val viewModel: SavingVM by viewModels()

    override fun bindView() {
        binding.viewmodel = viewModel
    }

    override fun setObserver() {

    }

    override fun initData() {

    }
}