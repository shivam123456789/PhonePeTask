package com.test.phonepe.androidassignment1.data

import com.test.phonepe.androidassignment1.data.model.Venue

class PlaceRepositoryImpl(
    private val placeDataSource: PlaceDataSource
) : PlaceRepository {
    override suspend fun getTopPlaces(
        lat: String,
        lon: String,
        range: String,
        apiKey: String,
        pageSize: Int,
        pageNo: Int
    ): List<Venue> {
        return placeDataSource.getTopPlaces(
            lat= lat,
            lon= lon,
            range= range,
            apiKey = apiKey,
            pageSize = pageSize,
            pageNo = pageNo
        )
    }
}