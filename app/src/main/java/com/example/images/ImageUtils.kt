package com.example.images

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

object ImageUtils {

    fun loadBitmapBlocking(imageUrl: String): Bitmap {
        val url = URL(imageUrl)
        return BitmapFactory.decodeStream(url.openConnection().getInputStream())
    }
}