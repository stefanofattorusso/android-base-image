package com.stefattorusso.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.stefattorusso.core.base.fragment.BaseFragment
import com.stefattorusso.core.base.viewmodel.BaseViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun getViewModel(): BaseViewModel = viewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        show_grid_btn.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_gridFragment) }

    }

}