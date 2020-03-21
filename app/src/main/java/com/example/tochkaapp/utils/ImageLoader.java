package com.example.tochkaapp.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoader {
    public static void setImageUrl(ImageView imageView, String imageUrl) {
        Context context = imageView.getContext();
        Glide.with(context)
                .load(imageUrl)
                .into(imageView);
    }

}
