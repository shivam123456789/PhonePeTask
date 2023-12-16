package com.test.phonepe.androidassignment1.data.injection

import com.test.phonepe.androidassignment1.data.PlaceRepository
import com.test.phonepe.androidassignment1.data.PlaceRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single<PlaceRepository> {
        PlaceRepositoryImpl(get())
    }
}