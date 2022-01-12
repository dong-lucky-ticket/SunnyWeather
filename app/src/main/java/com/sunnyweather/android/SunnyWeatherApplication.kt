package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "22c83077853ed7e0d089980f48f593cf"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}