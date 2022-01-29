package com.ppizil.rtcaapp.base

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.ppizil.rtcaapp.R


abstract class BaseActivity<T : ViewDataBinding, S : BaseState>(@LayoutRes private val resId: Int) :
    AppCompatActivity() {

    lateinit var binding: T
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, resId)


        supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)
            ?.findNavController()?.let {
                navController = it
            }

        setObserver()
        viewBind()
        setViewModelLifecycle()
        initData()
    }

    fun setViewModelLifecycle() {
        binding.lifecycleOwner = this
    }

    abstract fun viewBind()
    abstract fun setObserver()
    abstract fun initData()


}
