package com.app.weather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.app.weather.logic.Repository
import com.app.weather.logic.model.Location

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""
    var locationLat = ""
    var placeName = ""

    val weatherLiveDate = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat)
    }

    fun refreshWeather(lng:String,lat:String){
        locationLiveData.value = Location(lng, lat)
    }
}