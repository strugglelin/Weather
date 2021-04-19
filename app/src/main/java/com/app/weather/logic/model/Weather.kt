package com.app.weather.logic.model

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)