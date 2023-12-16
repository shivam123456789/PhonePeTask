package com.test.phonepe.androidassignment1.data.remote.model

import com.google.gson.annotations.SerializedName

data class PaginationConfig(
    @SerializedName("isEnabled")
    val isEnabled: Boolean = false,
    @SerializedName("pagesize")
    val pagesize: Int = 0,
    @SerializedName("id")
    val id: String? = ""
)