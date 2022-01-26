import app.*
import common.*
import java.util.*

plugins {
    id(GradlePluginId.ANDROID_APP)
    id(GradlePluginId.kotlinAndroid)
    id(GradlePluginId.kotlinKapt)
    id(GradlePluginId.kotlinAndroidExtensions)
    //id(GradlePluginId.hilt)
}

//val releaseKeystoreFile = file("${projectDir}/dentiKey.jks")
val releaseKeystoreFile = rootProject.file("keystore.properties")
val debugKeystoreFile = file("${projectDir}/debug.keystore")
val properties = Properties()

android {

    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildToolsVersion

    defaultConfig.apply {
        applicationId = AppConfig.id

        minSdk = (AppConfig.minSdk)
        targetSdk = (AppConfig.targetSdk)

        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        //testInstrumentationRunner = "com.kaii.dentii.HiltTestRunner"
        //testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"


        compileOptions {
            // isCoreLibraryDesugaringEnabled=true
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

    }
//
//    testOptions.apply {
//        unitTests.isReturnDefaultValues = true
//        animationsDisabled = true
//    }
    buildTypes {

        getByName("release") {
            isMinifyEnabled = false
            isDebuggable = false
//
//            signingConfig = signingConfigs.create("release") {
//                properties.load(FileInputStream(releaseKeystoreFile))
//                keyAlias = properties.getProperty("keyAlias")
//                keyPassword = properties.getProperty("keyPassword")
//                storeFile = file(properties.getProperty("storeFile"))
//                storePassword = properties.getProperty("storePassword")
//            }
//
//            manifestPlaceholders["appName"] = "덴티아이"
//            manifestPlaceholders["appIcon"] = "@mipmap/ic_launcher"

        }

        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            applicationIdSuffix = ".dev"
//
//            signingConfig = signingConfigs.getByName("debug") {
//                properties.load(FileInputStream(debugKeystoreFile))
//
//                keyAlias = "androiddebugkey"
//                keyPassword = "android"
//                storeFile = debugKeystoreFile
//                storePassword = "android"
//            }
//
//            manifestPlaceholders["appName"] = "denti_dev"
//            manifestPlaceholders["appIcon"] = "@mipmap/ic_launcher"

        }
    }
// adding when duplicated error case
//    packagingOptions {
//        exclude("META-INF/AL2.0")
//        exclude("META-INF/LGPL2.1")
//        exclude("META-INF/LICENSE.md")
//        exclude("META-INF/LICENSE-notice.md")
//        exclude("META-INF/metadata.jvm.kotlin_module")
//        exclude("META-INF/gradle/incremental.annotation.processors")
//        exclude("META-INF/metadata.kotlin_module")
//    }

    kotlinOptions {
        jvmTarget = Versions.jvmTarget
    }

    buildFeatures {
        dataBinding = true
    }


//
//    repositories {
//        flatDir {
//            dirs("libs")
//        }
//    }

}


dependencies {

    //(ProjectDependenciesZip.AndroidLibList)

}
