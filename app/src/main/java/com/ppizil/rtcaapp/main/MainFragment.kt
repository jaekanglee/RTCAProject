package com.ppizil.rtcaapp.main

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.base.BaseFragment
import com.ppizil.rtcaapp.databinding.FragmentMainBinding
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

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    when (state) {
                        is MainViewState.DISMISS -> {

                        }
                        is MainViewState.LOADING -> {

                        }
                        is MainViewState.SUCCESS -> {
                            adapter.submitList(state.list)
                        }
                        is MainViewState.ADDING -> {
                            goDestinationFragment(
                                R.id.action_fragment_main_to_fragment_saving
                            )
                        }
                        is MainViewState.CLICK -> {

                        }
                    }
                }
            }
        }


    }

    override fun initData() {
    }

}