//pluginManagement {
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "com.android.library") {
//                useModule("com.android.tools.build:gradle:${requested.version}")
//            }
//            if (requested.id.id == "com.android.application") {
//                useModule("com.android.tools.build:gradle:${requested.version}")
//            }
//        }
//    }
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//    }
//}
//
//dependencyResolutionManagement {
//    repositories {
//        google()
//        mavenCentral()
//    }
//}

rootProject.name = "RtcaApp"
include(
    ":app",
    ":2_domain",
    ":3_data"
)
