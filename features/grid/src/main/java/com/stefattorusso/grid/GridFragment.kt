package com.stefattorusso.grid

import androidx.lifecycle.ViewModelProvider
import com.stefattorusso.core.base.fragment.BaseFragment
import com.stefattorusso.core.base.viewmodel.BaseViewModel

class GridFragment : BaseFragment(R.layout.fragment_grid){

    private val viewModel: GridViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(GridViewModel::class.java)
    }

    override fun getViewModel(): BaseViewModel = viewModel
}