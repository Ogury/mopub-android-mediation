## Changelog
 * 7.1.9.0
    * This version of the adapters has been certified with ironSource 7.1.9 and MoPub SDK 5.18.0.
    * Add support for banner ad format.

 * 7.1.8.0
    * This version of the adapters has been certified with ironSource 7.1.8 and MoPub SDK 5.18.0.

 * 7.1.7.0
    * This version of the adapters has been certified with ironSource 7.1.7 and MoPub SDK 5.17.0.

 * 7.1.6.1.0
    * This version of the adapters has been certified with ironSource 7.1.6.1 and MoPub SDK 5.17.0.

 * 7.1.6.0
    * This version of the adapters has been certified with ironSource 7.1.6 and MoPub SDK 5.17.0.
    * ironSource's artifacts are now distributed via GitHub. For migration information, visit [this article](https://developers.ironsrc.com/ironsource-mobile/android/ironsource-artifacts-github/).

 * 7.1.5.1.1
    * Remove mopub-sdk as a required dependency from POM file.

 * 7.1.5.1.0
    * This version of the adapters has been certified with ironSource 7.1.5.1 and MoPub SDK 5.16.4.

 * 7.1.5.0
    * This version of the adapters has been certified with ironSource 7.1.5 and MoPub SDK 5.16.4.

 * 7.1.3.0
    * This version of the adapters has been certified with ironSource 7.1.3 and MoPub SDK 5.16.2.
    * Add support for ironSource SDK to initialize with `Context` instead of `Activity`.

 * 7.1.0.2.0
    * This version of the adapters has been certified with ironSource 7.1.0.2 and MoPub SDK 5.15.0.

 * 7.1.0.1.0
    * This version of the adapters has been certified with ironSource 7.1.0.1 and MoPub SDK 5.15.0.

 * 7.0.4.1.1
    * Fix a bug where the rewarded video adapter fails to request a new ad after a show-related error happens.

 * 7.0.4.1.0
    * This version of the adapters has been certified with ironSource 7.0.4.1 and MoPub SDK 5.15.0.
    * Only for side by side mediation cases, ironSource adapters now optionally accept ad unit types to initialize. [Related documentation here.](https://developers.mopub.com/publishers/mediation/networks/ironsource/)

 * 7.0.3.1.0
    * This version of the adapters has been certified with ironSource 7.0.3.1 and MoPub SDK 5.14.0.

 * 7.0.2.0
    * This version of the adapters has been certified with ironSource 7.0.2 and MoPub SDK 5.14.0.

 * 7.0.1.1.0
    * This version of the adapters has been certified with ironSource 7.0.1.1 and MoPub SDK 5.13.1.

 * 6.18.0.1
    * Service release. No new features.

 * 6.18.0.0
    * This version of the adapters has been certified with ironSource 6.18.0 and MoPub SDK 5.13.1.

 * 6.17.0.1
    * Rename `Ironsource` to `ironsource` for the internal network name

 * 6.17.0.0
    * This version of the adapters has been certified with ironSource 6.17.0 and MoPub SDK 5.13.0.

 * 6.16.1.1
    * Refactor non-native adapter classes to use the new consolidated API from MoPub.
    * This and newer adapter versions are only compatible with 5.13.0+ MoPub SDK.

 * 6.16.1.0
    * This version of the adapters has been certified with ironSource 6.16.1 and MoPub SDK 5.12.0.

 * 6.16.0.0
    * This version of the adapters has been certified with ironSource 6.16.0 and MoPub SDK 5.12.0.
    * Support for Android Archive (AAR) version of the ironSource SDK.

 * 6.15.0.1.0
    * This version of the adapters has been certified with ironSource 6.15.0.1 and MoPub SDK 5.11.1.

 * 6.14.0.1.0
    * This version of the adapters has been certified with ironSource 6.14.0.1.

 * 6.14.0.0
    * This version of the adapters has been certified with ironSource 6.14.0.

 * 6.13.0.1.0
    * This version of the adapters has been certified with ironSource 6.13.0.1.
    * Log the ironSource instance id in ad lifecycle events, and improve error console logs.

 * 6.13.0.0
    * This version of the adapters has been certified with ironSource 6.13.0.

 * 6.11.0.0
    * This version of the adapters has been certified with ironSource 6.11.0.

 * 6.10.2.0
    * This version of the adapters has been certified with ironSource 6.10.2.

 * 6.10.1.0
    * This version of the adapters has been certified with ironSource 6.10.1.

 * 6.10.0.0
    * This version of the adapters has been certified with ironSource 6.10.0.

 * 6.9.1.1
    * Add support for AndroidX. This is the minimum version compatible with MoPub 5.9.0.

 * 6.9.1.0
    * This version of the adapters has been certified with ironSource 6.9.1.

 * 6.9.0.0
    * This version of the adapters has been certified with ironSource 6.9.0.

 * 6.8.5.0
    * This version of the adapters has been certified with ironSource 6.8.5.

 * 6.8.4.0
    * This version of the adapters has been certified with ironSource 6.8.4.
    * Revised adapter code to comply with ironSource 6.8.4.
    * Remove `placementName`, ironSource SDK 6.8.4 no longer uses it.
    * Ad load will fail gracefully if the unique `instanceIds` are not used during concurrent ad requests for rewarded video.
    
 * 6.8.3.0
    * This version of the adapters has been certified with ironSource 6.8.3.

 * 6.8.2.2
    * Pass MoPub's log level to ironSource. To adjust ironSource's log level via MoPub's log settings, reference [this page](https://developers.mopub.com/publishers/android/test/#enable-logging).

* 6.8.2.1
    * IronSource Adapter will now be released as an Android Archive (AAR) file that includes manifest file for [IronSource manifest changes](https://developers.ironsrc.com/ironsource-mobile/android/android-sdk/#step-2).

 * 6.8.2.0
    * This version of the adapters has been certified with ironSource 6.8.2.

  * 6.8.1.0
    * This version of the adapters has been certified with ironSource 6.8.1.
    
  * 6.8.0.1.1
    * **Note**: This version is only compatible with the 5.5.0+ release of the MoPub SDK.
    * Add the `IronSourceAdapterConfiguration` class to: 
         * pre-initialize the ironSource SDK during MoPub SDK initialization process
         * store adapter and SDK versions for logging purpose
    * Streamline adapter logs via `MoPubLog` to make debugging more efficient. For more details, check the [Android Initialization guide](https://developers.mopub.com/docs/android/initialization/) and [Writing Custom Events guide](https://developers.mopub.com/docs/android/custom-events/).

  * 6.8.0.1.0
    * This version of the adapters has been certified with ironSource 6.8.0.1.
    
  * 6.7.12.0
    * This version of the adapters has been certified with ironSource 6.7.12.

  * 6.7.11.0
    * This version of the adapters has been certified with ironSource 6.7.11.
    * Fail the adapter and exit if the ironSource application key is returned empty.

  * 6.7.10.2
    * Update the instance ID returned in the `getAdNetworkId` API (used to generate server-side rewarded video callback URL) to be non-null, and avoid potential NullPointerExceptions.


  * 6.7.10.1
    * This version of the adapters has been certified with IronSource 6.7.10

  * 6.7.9.1.0
    * This version of the adapters has been certified with IronSource 6.7.9.1

  * 6.7.9.1
    * Add Activity lifecycle listeners
    * Call MoPub's `onInterstitialFailed()` when an ironSource interstitial fails to show

  * 6.7.9.0
    * This version of the adapters has been certified with IronSource 6.7.9.
    * General Data Protection Regulation (GDPR) update to support a way for publishers to determine GDPR applicability and to obtain/manage consent from users in European Economic Area, the United Kingdom, or Switzerland to serve personalize ads. Only applicable when integrated with MoPub version 5.0.0 and above.

  * 6.7.8.0
    * This version of the adapters has been certified with IronSource 6.7.8.

  * 6.7.7.0
    * This version of the adapters has been certified with IronSource 6.7.7.
	
  * Initial Commit
  	* Adapters moved from [mopub-android-sdk](https://github.com/mopub/mopub-android-sdk) to [mopub-android-mediation](https://github.com/mopub/mopub-android-mediation/)
