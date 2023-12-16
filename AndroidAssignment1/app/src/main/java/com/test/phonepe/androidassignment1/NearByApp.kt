package com.test.phonepe.androidassignment1

import android.app.Application
import com.test.phonepe.androidassignment1.data.injection.dataModule
import com.test.phonepe.androidassignment1.data.remote.injection.remoteDataModule
import com.test.phonepe.androidassignment1.domain.injection.domainModule
import com.test.phonepe.androidassignment1.presentation.injection.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class NearByApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@NearByApp)
            modules(
                remoteDataModule, dataModule, domainModule, presentationModule
            )
        }
    }
}