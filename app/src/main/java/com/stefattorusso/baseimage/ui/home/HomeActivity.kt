package com.stefattorusso.baseimage.ui.home

import android.os.Bundle
import android.view.View
import com.stefattorusso.baseimage.R
import com.stefattorusso.common.newInstance
import com.stefattorusso.core.base.BaseFragmentActivity
import com.stefattorusso.home.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseFragmentActivity<HomeFragment>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onLoadFragmentContainer(): View = container

    override fun onCreateFragment(): HomeFragment = HomeFragment().newInstance(intent.extras)
}
