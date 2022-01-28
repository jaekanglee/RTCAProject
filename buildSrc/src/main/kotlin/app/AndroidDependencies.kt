import common.Versions


object AndroidDependencies {
    // ANDROID
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    //const val materialDesign = "com.google.android.material:material:${common.Versions.materialDesign}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleRunTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    //const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"


    // recyclerview
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"

    // navigation
    const val navigationRuntimeKtx =
        "androidx.navigation:navigation-runtime-ktx:${Versions.navigation}"
    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKapt = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.hiltCore}"
    const val hiltLifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltAndroidX}"
    const val hiltCore = "com.google.dagger:hilt-android:${Versions.hiltCore}"

    // hiltKapt
    const val hiltKapt = "com.google.dagger:hilt-android-compiler:${Versions.hiltCore}"
    const val hiltAndroidx = "androidx.hilt:hilt-compiler:${Versions.hiltAndroidX}"

    // hiltAnnoation
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltCore}"

    // AsyncLib
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

}
