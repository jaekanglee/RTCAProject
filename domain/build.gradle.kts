import AppConfig.compileSdk
import Extension.implementation
import Extension.implementationList
import Extension.kaptList

plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    id(GradlePluginId.kotlinAndroid)
    id(GradlePluginId.kotlinKapt)
    id(GradlePluginId.kotlinAndroidExtensions)
    id(GradlePluginId.hilt)
}

android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildToolsVersion


    kotlinOptions {
        jvmTarget = common.Versions.jvmTarget
    }
}

dependencies {

    implementation(AndroidDependencies.coreKtx)

    implementationList(ProjectDependenciesZip.HiltDependencies)
    kaptList(ProjectDependenciesZip.HiltLibraryKapt)

    implementationList(ProjectDependenciesZip.coroutine)
}