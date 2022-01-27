
import common.ThirdPartyDependencies
import common.Versions

object ProjectDependenciesZip {

    val AndroidLibList : ArrayList<String> by lazy {
        ArrayList<String>().apply {
            add(AndroidDependencies.kotlin)
            add(AndroidDependencies.appCompat)
            add(AndroidDependencies.coreKtx)
            add(AndroidDependencies.constraintLayout)
            add(AndroidDependencies.lifecycleViewModel)
            add(AndroidDependencies.lifecycleExtensions)
            add(AndroidDependencies.lifecycleLiveData)
            add(AndroidDependencies.lifecycleRunTime)
            add(AndroidDependencies.fragment)
            add(AndroidDependencies.recyclerView)

            add(AndroidDependencies.navigationRuntimeKtx)
            add(AndroidDependencies.navigationFragmentKtx)
            add(AndroidDependencies.navigationUiKtx)
        }
    }



    val HiltDependencies =
        ArrayList<String>().apply {
            add(AndroidDependencies.hilt)
            add(AndroidDependencies.hiltCore)
            add(AndroidDependencies.hiltLifecycle)
        }


    val HiltAnnotation =
        ArrayList<String>().apply {
            add(AndroidDependencies.hiltCompiler)
        }


    val HiltLibraryKapt =
        ArrayList<String>().apply {
            add(AndroidDependencies.hiltKapt)
            add(AndroidDependencies.hiltAndroidx)
        }


    val coroutine =
        ArrayList<String>().apply {
            add(AndroidDependencies.coroutine)
        }


    val roomLibrary =
        ArrayList<String>().apply {
            add(AndroidDependencies.roomRuntime)
            add(AndroidDependencies.roomKapt)
            add(AndroidDependencies.roomKtx)
            add(AndroidDependencies.roomRx)
        }


    val RetrofitThirdPartyDependencies =
        ArrayList<String>().apply {
            add(ThirdPartyDependencies.gson)
            add(ThirdPartyDependencies.retrofit)
            add(ThirdPartyDependencies.retrofitGsonConverter)
            add(ThirdPartyDependencies.retrofitMoshiConverter)
            add(ThirdPartyDependencies.httpLoggingInterceptor)
        }


    val Glide =
        ArrayList<String>().apply {
            add(ThirdPartyDependencies.glide)
            add(ThirdPartyDependencies.glideCompiler)
        }

}


object GradleClasspath {
    const val androidGradlePlugin =
        "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlinGradlePluginClasspath =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val hiltGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltCore}"
    const val googleCrashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.5.2"
    const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.2"
    const val googleService = "com.google.gms:google-services:4.3.4"
}