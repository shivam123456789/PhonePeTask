package com.test.phonepe.androidassignment1.domain.injection

import com.test.phonepe.androidassignment1.domain.DefaultSchedulers
import com.test.phonepe.androidassignment1.domain.FetchTopPlacesUsecase
import com.test.phonepe.androidassignment1.domain.Schedulers
import org.koin.dsl.module

val domainModule = module {
    single<Schedulers> {
        DefaultSchedulers
    }

    single<FetchTopPlacesUsecase> {
        FetchTopPlacesUsecase(get())
    }
}