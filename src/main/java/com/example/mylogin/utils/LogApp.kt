package com.example.mylogin.utils

import android.app.Application


class LogApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AppPreferences.init(this)
    }
}