import Extension.implementation
import Extension.implementationList
import Extension.kaptList
import Extension.ksp

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
    implementation(project(app.ModuleGraph.domain))
    implementation(AndroidDependencies.coreKtx)

    implementationList(ProjectDependenciesZip.coroutine)
    implementationList(ProjectDependenciesZip.RetrofitThirdPartyDependencies)

    implementationList(ProjectDependenciesZip.roomLibrary)
    annotationProcessor(AndroidDependencies.roomKapt)
    kapt(AndroidDependencies.roomKapt)


    implementationList(ProjectDependenciesZip.HiltDependencies)
    kaptList(ProjectDependenciesZip.HiltLibraryKapt)
}