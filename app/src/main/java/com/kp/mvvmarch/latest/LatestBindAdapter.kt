package com.kp.mvvmarch.latest

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object  LatestBindAdapter {
        @BindingAdapter("imagePath")
        @JvmStatic
        fun bindLatestImage(mView: ImageView, mImagePath: String) {
            Glide.with(mView.context).load("https://image.tmdb.org/t/p/original$mImagePath").into(mView)
    }
}