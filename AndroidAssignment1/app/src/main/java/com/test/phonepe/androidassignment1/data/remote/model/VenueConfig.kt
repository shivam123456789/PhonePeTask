package com.test.phonepe.androidassignment1.data.remote.model

import com.google.gson.annotations.SerializedName

data class VenueConfig(
    @SerializedName("lat")
    val lat: String = "",
    @SerializedName("lon")
    val lon: String = "",
    @SerializedName("range")
    val range: String = "",
    @SerializedName("apiKey")
    val apiKey: String = "",
    @SerializedName("id")
    val id: String = ""
)