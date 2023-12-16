package com.test.phonepe.androidassignment1.presentation

import com.test.phonepe.androidassignment1.data.model.Venue

sealed class ResultStates {

    object Loading : ResultStates()

    data class Success(
        val places: List<Venue>, val isRefreshing: Boolean
    ) : ResultStates()

    data class Error(
        val errorDetails: String
    ) : ResultStates()
}
