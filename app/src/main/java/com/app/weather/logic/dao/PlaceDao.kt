package com.app.weather.logic.dao

import android.content.Context
import com.app.weather.App
import com.app.weather.logic.model.Place
import com.google.gson.Gson

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
object PlaceDao {
    private fun sharedPreferences() = App.context.
        getSharedPreferences("weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place){
        sharedPreferences().edit().putString("place",Gson().toJson(place)).apply()
    }

    fun getPlace():Place{
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isSavedPlace() = sharedPreferences().contains("place")
}