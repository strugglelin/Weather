package com.app.weather.logic

import androidx.lifecycle.liveData
import com.app.weather.logic.model.Place
import com.app.weather.logic.network.WeatherNetWork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {

        val result = try {
            val placeResponse = WeatherNetWork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}