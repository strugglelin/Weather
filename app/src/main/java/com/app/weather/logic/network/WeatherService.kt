package com.app.weather.logic.network

import com.app.weather.App
import com.app.weather.logic.model.DailyResponse
import com.app.weather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
interface WeatherService {
    @GET("v2.5/${App.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>

    @GET("v2.5/${App.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}