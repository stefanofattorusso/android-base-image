package com.stefattorusso.common

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

// Images

fun ImageView.loadUri(uri: Uri?) {
    if (uri == null) return
    Glide.with(context)
        .load(uri)
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions().override(200, 200))
        .into(this)
}


fun ImageView.loadUrl(url: String?) {
    if (url == null) return
    Glide.with(context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions().override(200, 200))
        .into(this)
}

fun ImageView.loadUrl(url: String?, w: Int, h: Int) {
    if (url == null) return
    Glide.with(context)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions().override(w, h))
        .into(this)
}

fun ImageView.loadUrl(url: String?, callback: () -> Unit) {
    if (url == null) return
    Glide.with(context)
        .load(url)
        .dontAnimate()
        .dontTransform()
        .listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                callback()
                return false
            }

        })
        .into(this)
}


// Activity

fun <TFragment : Fragment> AppCompatActivity.loadFragment(
    containerId: Int,
    fragment: TFragment
) {
    supportFragmentManager
        .beginTransaction()
        .replace(containerId, fragment, fragment.javaClass.simpleName)
        .commit()
}

fun AppCompatActivity.getFragment(containerId: Int) = supportFragmentManager.findFragmentById(containerId)

// Fragment

fun <TFragment : Fragment> TFragment.newInstance(bundle: Bundle?): TFragment {
    return this.apply { arguments = bundle ?: Bundle() }
}


