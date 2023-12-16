package com.test.phonepe.androidassignment1.data

import com.test.phonepe.androidassignment1.data.model.Venue

interface PlaceDataSource {
    suspend fun getTopPlaces(
        lat: String,
        lon: String,
        range: String,
        apiKey: String,
        pageSize: Int,
        pageNo: Int
    ): List<Venue>
}