package com.rareprob.core_pulgin.core.utils

import android.content.Context
import android.content.SharedPreferences
import com.rareprob.core_pulgin.core.base.BaseCoreApplication

object AppPreferences {
    private const val APP_PREFERENCES_FILE_NAME = "app_preferences"

    private fun getPreferencesInstance(): SharedPreferences {
        val context = BaseCoreApplication.getInstance()
        return context.getSharedPreferences(
            APP_PREFERENCES_FILE_NAME,
            Context.MODE_PRIVATE
        )
    }

    fun getBoolean(booleanKey: String): Boolean {
        val sharedPreferences: SharedPreferences = getPreferencesInstance()
        return sharedPreferences.getBoolean(booleanKey, false)
    }

    fun putBoolean(booleanKey: String, value: Boolean): Boolean {

        val sharedPreferences: SharedPreferences = getPreferencesInstance()
        return sharedPreferences.edit().putBoolean(booleanKey, value).commit()
    }
}