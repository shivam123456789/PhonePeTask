package com.test.phonepe.androidassignment1.domain

import com.test.phonepe.androidassignment1.data.PlaceRepository
import com.test.phonepe.androidassignment1.data.model.Venue

class FetchTopPlacesUsecase (
    private val placeRepository: PlaceRepository
) : BaseUsecase<List<Venue>, Unit>() {
    override suspend fun invoke(parameters: Unit?): List<Venue> {

        return placeRepository.getTopPlaces(
            lat = "12.971599",
            lon = "77.594566",
            range = "12mi",
            apiKey = "Mzg0OTc0Njl8MTcwMDgxMTg5NC44MDk2NjY5",
            pageSize = 10,
            pageNo = 0
        )
    }
}