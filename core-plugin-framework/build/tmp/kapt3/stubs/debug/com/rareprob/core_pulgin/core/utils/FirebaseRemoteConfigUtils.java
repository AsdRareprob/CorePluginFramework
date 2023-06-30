package com.rareprob.core_pulgin.core.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rareprob.core_pulgin.core.base.NetworkUtils;
import com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData;
import org.json.JSONObject;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/rareprob/core_pulgin/core/utils/FirebaseRemoteConfigUtils;", "", "()V", "PREMIUM_PACK_DATA_KEY", "", "getInAppProducts", "", "Lcom/rareprob/core_pulgin/plugins/payment/in_app_purchase/data/model/ProductListingData;", "defaultLocalPackJson", "context", "Landroid/content/Context;", "core-plugin-framework_debug"})
public final class FirebaseRemoteConfigUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.rareprob.core_pulgin.core.utils.FirebaseRemoteConfigUtils INSTANCE = null;
    private static final java.lang.String PREMIUM_PACK_DATA_KEY = "premium_pack_data_test";
    
    private FirebaseRemoteConfigUtils() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.rareprob.core_pulgin.plugins.payment.in_app_purchase.data.model.ProductListingData> getInAppProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String defaultLocalPackJson, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}