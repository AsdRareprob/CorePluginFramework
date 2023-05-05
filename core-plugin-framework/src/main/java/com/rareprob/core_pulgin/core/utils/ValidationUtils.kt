package com.rareprob.core_pulgin.core.utils

import android.util.Patterns
import android.webkit.URLUtil

object ValidationUtils {

    fun isValidWebUrl(urlString: String?): Boolean {
        if (urlString.isNullOrEmpty())
            return false

        try {
            return URLUtil.isValidUrl(urlString) && Patterns.WEB_URL.matcher(urlString).matches()
        } catch (e: Exception) {
            // Timber.e("Error while checking is valid URL")
        }
        return false
    }
}