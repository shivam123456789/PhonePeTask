package com.test.phonepe.androidassignment1.data.remote

import com.test.phonepe.androidassignment1.data.PlaceDataSource
import com.test.phonepe.androidassignment1.data.model.Venue

class PlaceDataSourceRemote(
    private val placeApiService: PlaceApiService
) : PlaceDataSource {
    override suspend fun getTopPlaces(
        lat: String,
        lon: String,
        range: String,
        apiKey: String,
        pageSize: Int,
        pageNo: Int
    ): List<Venue> {
        return placeApiService.getTopPlaces(
            lat = lat,
            lon = lon,
            range = range,
            apiKey = apiKey,
            pageSize = pageSize,
            pageNo = pageNo
        ).venues?.map {
            Venue(
                nameV2 = it?.nameV2,
                address = it?.address,
                extendedAddress = it?.extendedAddress
            )
        } ?: emptyList()
    }
}