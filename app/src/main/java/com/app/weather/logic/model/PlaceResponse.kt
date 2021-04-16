package com.app.weather.logic.model

import com.google.gson.annotations.SerializedName

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)