package com.rareprob.core_pulgin.payment

object RareprobAppsInfo {
    var FILE_MANAGER = "filemanager.files.fileexplorer.android.folder"
}

enum class FeatureInfo() {
    THEME,
    NO_ADS,
    TRASH,
    LYRICS,
    CROP,
    FILTER_DUPLICATE,
    NONE;

    companion object {
        var appFeatures = ArrayList<FeatureInfo>()
        fun getAppSpecificFeatures(applicationId: String): List<FeatureInfo> {
            appFeatures.clear()
            when (applicationId) {
                RareprobAppsInfo.FILE_MANAGER -> {
//                    appFeatures.add(THEME)
                    appFeatures.add(NO_ADS)
//                    appFeatures.add(TRASH)
                }
            }
            return appFeatures
        }
    }
}

