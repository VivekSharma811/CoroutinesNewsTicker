package com.devtides.androidcoroutinesretrofit.model

import com.google.gson.annotations.SerializedName


data class NewsArticle(
    val author: String? = null,
    val title: String? = null,
    val description: String? = null,
    @SerializedName("imageUrl")
    val url: String? = null,
    val urlToImage: String? = null,
    val publishedAt: String? = null
)