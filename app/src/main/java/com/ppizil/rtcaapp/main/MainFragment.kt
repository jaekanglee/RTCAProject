package com.ppizil.rtcaapp.main

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
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

    //Todo : https://medium.com/prnd/mvvm%EC%9D%98-viewmodel%EC%97%90%EC%84%9C-%EC%9D%B4%EB%B2%A4%ED%8A%B8%EB%A5%BC-%EC%B2%98%EB%A6%AC%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95-6%EA%B0%80%EC%A7%80-31bb183a88ce
    override fun setObserver() {

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect { state ->
                    val result = state.getContentIfNotHandled()
                    when (result) {
                        is MainViewState.DISMISS -> {

                        }
                        is MainViewState.LOADING -> {

                        }
                        is MainViewState.SUCCESS -> {
                            adapter.submitList(result.list)
                        }
                        is MainViewState.ADDING -> {
                            findNavController().navigate(R.id.action_fragment_main_to_fragment_saving)
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