import common.Versions

object AppConfig {
    const val id = "com.kaii.dentii"

    //버전 코드 기준 -> 1씩 추가
    const val versionCode = 1
    const val versionName = "v1.0.0"

    const val compileSdk = 32
    const val minSdk = 21
    const val targetSdk = 32
    const val buildToolsVersion = "30.0.2"

    const val androidTestInstrumentation = "android.support.test.runner.AndroidJUnitRunner"

}

object GradlePluginId {
    const val BASE_GRADLE_PLUGIN = "base-gradle-plugin"
    const val ANDROID_APP = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val FIREBASE_CRASH ="com.google.firebase.crashlytics"

    const val kotlin = "kotlin"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val kotlinAndroidExtensions = "kotlin-parcelize"
    const val hilt = "dagger.hilt.android.plugin"

    const val googlePluginService = "com.google.gms.google-services"
}


