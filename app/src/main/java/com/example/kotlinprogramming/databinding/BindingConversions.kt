package com.example.kotlinprogramming.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.kotlinprogramming.R

object BindingConversions {

    @BindingAdapter("imageUrl")
    @JvmStatic

    fun loadImage(imageView: ImageView, url: String) {
        Glide.with(imageView.context).load(url).error(R.drawable.ic_launcher_background).into(imageView)
    }
}