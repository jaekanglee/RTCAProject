package com.ppizil.rtcaapp.main

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.base.goDestinationFragment
import com.ppizil.rtcaapp.databinding.FragmentMainBinding
import com.ppizil.rtcaapp.utils.makeLog
import com.ppizil.rtcaapp.utils.repeatOnStarted
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewState>(R.layout.fragment_main) {

    private val viewModel: MainViewModel by viewModels()

    private val adapter: EventListAdapter by lazy {
        EventListAdapter(
            viewModel
        )
    }


    override fun bindView() {
        binding.adapter = adapter
        binding.viewModel = viewModel

    }

    override fun setObserver() {
        repeatOnStarted {
            viewModel.uiState.collect { state ->
                state.makeLog(null)
                when (state) {
                    is MainViewState.DISMISS -> {

                    }
                    is MainViewState.LOADING -> {

                    }
                    is MainViewState.SUCCESS -> {
                        adapter.submitList(state.list)
                    }
                    is MainViewState.ADDING -> {
                        goDestinationFragment(R.id.action_fragment_main_to_fragment_saving)
                    }
                    is MainViewState.CLICK -> {

                    }
                    is MainViewState.TOAST -> {

                    }
                }
            }
        }

    }

    override fun initData() {
    }

}