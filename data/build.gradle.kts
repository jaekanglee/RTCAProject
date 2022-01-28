import Extension.implementation
import Extension.implementationList

plugins {
    id(GradlePluginId.ANDROID_LIBRARY)
    id(GradlePluginId.kotlinAndroid)
    id(GradlePluginId.kotlinKapt)
    id(GradlePluginId.kotlinAndroidExtensions)
}


android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildToolsVersion


    kotlinOptions {
        jvmTarget = common.Versions.jvmTarget
    }
}

dependencies {
    project(app.ModuleGraph.domain)
    implementation(AndroidDependencies.coreKtx)

    implementationList(ProjectDependenciesZip.coroutine)
    implementationList(ProjectDependenciesZip.RetrofitThirdPartyDependencies)

}