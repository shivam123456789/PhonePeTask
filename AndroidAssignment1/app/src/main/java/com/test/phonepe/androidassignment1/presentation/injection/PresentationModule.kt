package com.test.phonepe.androidassignment1.presentation.injection

import com.test.phonepe.androidassignment1.presentation.PlaceViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        PlaceViewModel(get())
    }
}