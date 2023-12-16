package com.test.phonepe.androidassignment1.data.remote.injection

import com.test.phonepe.androidassignment1.data.PlaceDataSource
import com.test.phonepe.androidassignment1.data.remote.RetrofitFactory
import com.test.phonepe.androidassignment1.data.remote.PlaceDataSourceRemote
import com.test.phonepe.androidassignment1.data.remote.PlaceApiService
import org.koin.dsl.module

val remoteDataModule = module {
    single {
        RetrofitFactory
    }

    single<PlaceApiService> {
        RetrofitFactory.getRetrofit("https://api.seatgeek.com/2/")
            .create(PlaceApiService::class.java)
    }

    single<PlaceDataSource> {
        PlaceDataSourceRemote(get())
    }
}