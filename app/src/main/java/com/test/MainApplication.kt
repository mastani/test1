package com.test

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {
    private val TAG = MainApplication::class.java.name

    override fun attachBaseContext(base: Context?) {
        MultiDex.install(this)
    }
}