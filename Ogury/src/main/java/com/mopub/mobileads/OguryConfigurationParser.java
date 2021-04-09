package com.mopub.mobileads;

import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Map;

public class OguryConfigurationParser {

    private static final String AD_UNIT_ID_KEY = "ad_unit_id";

    @Nullable
    public static String getAdUnitId(Map<String, String> adDataExtras) {
        if (adDataExtras != null && !adDataExtras.isEmpty()) {
            return adDataExtras.get(AD_UNIT_ID_KEY);
        }
        return null;
    }

    public static boolean isAdUnitIdValid(@Nullable String adUnitId) {
        return adUnitId != null && !TextUtils.isEmpty(adUnitId);
    }
}
