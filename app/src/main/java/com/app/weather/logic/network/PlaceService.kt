package com.app.weather.logic.network

import com.app.weather.App
import com.app.weather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
interface PlaceService {
    /**
     * 获取全球城市
     */
    @GET("v2/place?token=${App.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String):Call<PlaceResponse>
}