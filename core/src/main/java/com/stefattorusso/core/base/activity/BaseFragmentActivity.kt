package com.stefattorusso.core.base.activity

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.stefattorusso.common.getFragment
import com.stefattorusso.common.loadFragment

abstract class BaseFragmentActivity<TFragment> : BaseActivity() {

    private var mFragment: TFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createFragment(savedInstanceState)
    }

    protected fun getFragment() = mFragment

    protected abstract fun onLoadFragmentContainer(): View

    protected abstract fun onCreateFragment(): TFragment

    private fun createFragment(savedInstanceState: Bundle?) {
        lifecycleScope.launchWhenStarted {
            val contentView = onLoadFragmentContainer()
            if (savedInstanceState == null) {
                mFragment = onCreateFragment()
                mFragment?.let { loadFragment(contentView.id, it as Fragment) }
            } else {
                mFragment = getFragment(contentView.id) as? TFragment
            }
        }
    }
}