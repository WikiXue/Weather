package com.weather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val Token = "BNBRvBveaD2VfHVI"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}