package com.mopub.mobileads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mopub.common.BaseAdapterConfiguration;
import com.mopub.common.MoPub;
import com.mopub.common.OnNetworkInitializationFinishedListener;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.ogury.BuildConfig;
import com.ogury.sdk.Ogury;
import com.ogury.sdk.OguryConfiguration;

import java.util.Map;

import static com.mopub.common.logging.MoPubLog.AdapterLogEvent.CUSTOM;

public class OguryAdapterConfiguration extends BaseAdapterConfiguration {
    // Adapter's constants
    private static final String ADAPTER_NAME = OguryAdapterConfiguration.class.getSimpleName();
    private static final String MOPUB_NETWORK_NAME = BuildConfig.NETWORK_NAME;
    private static final String ADAPTER_VERSION = BuildConfig.VERSION_NAME;

    // Configuration constants
    private static final String CONFIG_KEY_ASSET_KEY = "asset_key";

    // Monitoring constants
    private static final String MONITORING_KEY_MODULE_VERSION = "mopub_ce_version";
    private static final String MONITORING_KEY_MOPUB_VERSION = "mopub_mediation_version";

    @NonNull
    @Override
    public String getMoPubNetworkName() {
        return MOPUB_NETWORK_NAME;
    }

    @NonNull
    @Override
    public String getNetworkSdkVersion() {
        final String SdkVersion = Ogury.getSdkVersion();

        if (!TextUtils.isEmpty(SdkVersion)) {
            return SdkVersion;
        }

        final String adapterVersion = getAdapterVersion();
        return adapterVersion.substring(0, adapterVersion.lastIndexOf('.'));
    }

    @NonNull
    @Override
    public String getAdapterVersion() {
        return ADAPTER_VERSION;
    }

    @Nullable
    @Override
    public String getBiddingToken(@NonNull Context context) {
        return null;
    }

    @Override
    public void initializeNetwork(@NonNull Context context, @Nullable Map<String, String> configuration, @NonNull OnNetworkInitializationFinishedListener listener) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(listener);

        String assetKey = null;
        if (configuration != null && !configuration.isEmpty()) {
            assetKey = configuration.get(CONFIG_KEY_ASSET_KEY);
        }
        if (assetKey == null || assetKey.isEmpty()) {
            MoPubLog.log(CUSTOM, ADAPTER_NAME, "Ogury's initialization not started as the asset key is missing or empty.");
            return;
        }

        OguryConfiguration oguryConfiguration = new OguryConfiguration.Builder(context, assetKey)
                .putMonitoringInfo(MONITORING_KEY_MODULE_VERSION, getAdapterVersion())
                .putMonitoringInfo(MONITORING_KEY_MOPUB_VERSION, getMoPubVersion())
                .build();

        Ogury.start(oguryConfiguration);
    }

    /**
     * Retrieve MoPub version using reflection to know the exact version available in the application.
     *
     * Using the constant instead will make the compiler replace the value in the produced binary.
     * By using reflection, we are able to obtain the version integrated by the final user.
     *
     * @return the version of MoPub integrated in the final user's application.
     */
    private static String getMoPubVersion() {
        String mopubVersion = "";
        try {
            mopubVersion = (String) MoPub.class.getDeclaredField("SDK_VERSION").get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            // Ignore errors since it is not recoverable.
        }
        return mopubVersion;
    }
}
