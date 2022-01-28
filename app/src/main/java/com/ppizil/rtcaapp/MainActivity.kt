package com.ppizil.rtcaapp

import android.view.MenuItem
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ppizil.rtcaapp.base.BaseActivity
import com.ppizil.rtcaapp.databinding.ActivityMainBinding
import com.ppizil.rtcaapp.main.MainViewState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding,MainViewState>(R.layout.activity_main) ,
    BottomNavigationView.OnNavigationItemSelectedListener,
    BottomNavigationView.OnNavigationItemReselectedListener{
    override fun viewBind() {

    }

    override fun setObserver() {

    }

    override fun initData() {

    }


    override fun onNavigationItemReselected(item: MenuItem) {

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, navController)
    }

}