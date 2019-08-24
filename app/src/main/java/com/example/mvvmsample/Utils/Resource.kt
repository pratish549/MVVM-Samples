package com.example.mvvmsample.Utils

import java.lang.Exception

data class Resource<out T>(val status: Status, val data: T?, val exception: Exception?) {
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(exception: Exception): Resource<T> {
            return Resource(Status.ERROR, null, exception)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }
    }
}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}
