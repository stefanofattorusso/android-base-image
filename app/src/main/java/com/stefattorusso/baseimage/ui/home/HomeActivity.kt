package com.stefattorusso.baseimage.ui.home

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.stefattorusso.baseimage.R
import com.stefattorusso.common.newInstance
import com.stefattorusso.core.base.activity.BaseActivity
import com.stefattorusso.core.base.activity.BaseFragmentActivity
import com.stefattorusso.home.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navController = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navController)
    }


}
