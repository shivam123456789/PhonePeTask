package com.test.phonepe.androidassignment1.domain

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface Schedulers {
    fun io(): CoroutineDispatcher
    fun background(): CoroutineDispatcher
    fun main(): CoroutineDispatcher
}

object DefaultSchedulers : Schedulers {
    override fun io(): CoroutineDispatcher = Dispatchers.IO

    override fun background(): CoroutineDispatcher = Dispatchers.Default

    override fun main(): CoroutineDispatcher = Dispatchers.Main

}