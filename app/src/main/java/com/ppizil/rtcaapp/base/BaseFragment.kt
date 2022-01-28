package com.ppizil.rtcaapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.utils.getCurrentMethodName
import com.ppizil.rtcaapp.utils.makeLog

abstract class BaseFragment<T : ViewDataBinding, S : BaseState>(@LayoutRes private val resId: Int) : Fragment() {

    lateinit var binding: T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, resId, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObserver()
        bindView()
        setViewModelLifecycle()
        initData()
    }

    abstract fun bindView()
    abstract fun setObserver()
    abstract fun initData()


    fun goDestinationFragment(destinationId: Int) {
        findNavController().navigate(destinationId)
    }


    fun setViewModelLifecycle() {
        binding.lifecycleOwner = this
    }
}
