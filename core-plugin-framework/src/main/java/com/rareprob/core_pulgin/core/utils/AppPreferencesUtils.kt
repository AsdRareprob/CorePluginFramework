package com.rareprob.core_pulgin.core.utils

import android.content.Context
import android.content.SharedPreferences

object AppPreferencesUtils {
    private const val APP_PREFERENCES_FILE_NAME = "app_preferences"

    private fun getPreferencesInstance(context: Context): SharedPreferences {
        return context.getSharedPreferences(
            APP_PREFERENCES_FILE_NAME,
            Context.MODE_PRIVATE
        )
    }

    fun getLong(key: String, context: Context): Long {
        val sharedPreferences: SharedPreferences = getPreferencesInstance(context)
        return sharedPreferences.getLong(key, 0L)
    }

    fun putLong(key: String, value: Long, context: Context): Boolean {
        val sharedPreferences: SharedPreferences = getPreferencesInstance(context)
        return sharedPreferences.edit().putLong(key, value).commit()
    }

}