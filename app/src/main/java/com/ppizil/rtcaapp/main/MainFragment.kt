package com.ppizil.rtcaapp.main

import androidx.fragment.app.viewModels
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.base.EventObserver
import com.ppizil.rtcaapp.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding,MainViewState>(R.layout.fragment_main) {

    private val viewModel: MainViewModel by viewModels()

    private val adapter: SavingListAdapter by lazy {
        SavingListAdapter(
            viewModel
        )
    }


    override fun bindView() {
        binding.adapter = adapter
    }

    override fun setObserver() {

        viewModel.savingContentsList.observe(this, EventObserver {
            adapter.submitList(it)
        })

    }

    override fun initData() {
    }

    override fun onState(newState: MainViewState) {

    }
}