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

    fun getBoolean(key: String, context: Context): Boolean {
        val sharedPreferences: SharedPreferences = getPreferencesInstance(context)
        return sharedPreferences.getBoolean(key, false)
    }

    fun putBoolean(key: String, value: Boolean, context: Context): Boolean {
        val sharedPreferences: SharedPreferences = getPreferencesInstance(context)
        return sharedPreferences.edit().putBoolean(key, value).commit()
    }

    fun getString(key: String, context: Context): String {
        val sharedPreferences: SharedPreferences = getPreferencesInstance(context)
        return sharedPreferences.getString(key, "") ?: ""
    }

    fun putString(key: String, value: String, context: Context): Boolean {
        val sharedPreferences: SharedPreferences = getPreferencesInstance(context)
        return sharedPreferences.edit().putString(key, value).commit()
    }

}