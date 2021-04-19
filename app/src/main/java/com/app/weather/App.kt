package com.app.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *  @author strugglelin
 *  @date 2021/4/17
 *  description:
 */
class App : Application() {

    companion object {
        const val TOKEN = "Dd9EplGhvKADWREk" // 彩云天气令牌
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}