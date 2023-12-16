package com.test.phonepe.androidassignment1.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.phonepe.androidassignment1.domain.FetchTopPlacesUsecase
import kotlinx.coroutines.launch

class PlaceViewModel(
    private val fetchTopPlacesUsecase: FetchTopPlacesUsecase
) : ViewModel() {

    var resultStates by mutableStateOf<ResultStates>(ResultStates.Loading)
        private set

    fun getTopPlaces() {
        viewModelScope.launch() {
            val places = fetchTopPlacesUsecase()
            resultStates = ResultStates.Success(
                places, false
            )
        }

    }
}