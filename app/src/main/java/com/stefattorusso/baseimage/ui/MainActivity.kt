package com.stefattorusso.baseimage.ui

import android.os.Bundle
import com.stefattorusso.baseimage.R
import com.stefattorusso.core.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
