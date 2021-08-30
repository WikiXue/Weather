package com.weather.android.logic.model

data class Weather(val realTime: RealtimeResponse.RealTime, val daily: DailyResponse.Daily)