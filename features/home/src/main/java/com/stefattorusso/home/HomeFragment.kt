package com.stefattorusso.home

import androidx.lifecycle.ViewModelProvider
import com.stefattorusso.core.base.BaseFragment

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)
    }

}