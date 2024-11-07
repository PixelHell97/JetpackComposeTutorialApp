package com.pixel.jetpackcomposetutorialapp.util

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesManager(
    context: Context,
) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("app_preferences", Context.MODE_PRIVATE)

    var isFirstLaunch: Boolean
        get() = sharedPreferences.getBoolean("isFirstLaunch", true)
        set(value) = sharedPreferences.edit().putBoolean("isFirstLaunch", value).apply()
}
