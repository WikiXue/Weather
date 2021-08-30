package com.weather.android.logic.model

import com.google.gson.annotations.SerializedName

class RealtimeResponse(val status: String, val result: Result) {

    class Result(val realTime: RealTime)

    class RealTime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    class AirQuality(val aqi: AQI)

    class AQI(val chn: Float)
}