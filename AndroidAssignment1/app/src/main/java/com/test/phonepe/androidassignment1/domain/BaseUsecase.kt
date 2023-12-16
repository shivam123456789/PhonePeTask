package com.test.phonepe.androidassignment1.domain

abstract class BaseUsecase<Result, Params> {

    abstract suspend operator fun invoke(parameters: Params? = null): Result
}