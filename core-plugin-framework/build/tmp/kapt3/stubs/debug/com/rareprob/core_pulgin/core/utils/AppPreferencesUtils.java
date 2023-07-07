package com.rareprob.core_pulgin.core.utils;

import android.content.Context;
import android.content.SharedPreferences;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/rareprob/core_pulgin/core/utils/AppPreferencesUtils;", "", "()V", "APP_PREFERENCES_FILE_NAME", "", "getBoolean", "", "key", "context", "Landroid/content/Context;", "getLong", "", "getPreferencesInstance", "Landroid/content/SharedPreferences;", "getString", "putBoolean", "value", "putLong", "putString", "core-plugin-framework_debug"})
public final class AppPreferencesUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.core.utils.AppPreferencesUtils INSTANCE = null;
    private static final java.lang.String APP_PREFERENCES_FILE_NAME = "app_preferences";
    
    private AppPreferencesUtils() {
        super();
    }
    
    private final android.content.SharedPreferences getPreferencesInstance(android.content.Context context) {
        return null;
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    public final boolean putLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}