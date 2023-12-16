package com.test.phonepe.androidassignment1.data.remote

import com.test.phonepe.androidassignment1.data.model.PlaceDetails
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceApiService {
    @GET("venues")
    suspend fun getTopPlaces(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("range") range: String,
        @Query("client_id") apiKey: String,
        @Query("per_page") pageSize: Int,
        @Query("page") pageNo: Int,
    ) : PlaceDetails
}


//https://api.seatgeek.com/2/venues?per_page=10&page=1&client_id=Mzg0OTc0Njl8MTcwMDgxMTg5NC44MDk2NjY5&lat=12.971599&lon=77.594566&range=12mi
//venues?per_page=10&page=1&client_id=Mzg0OTc0Njl8MTcwMDgxMTg5NC44MDk2NjY5&lat=12.971599&lon=77.594566&range=12mi&q=