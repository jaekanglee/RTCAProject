plugins {
    `kotlin-dsl`
}


repositories {
    google()
    mavenCentral()
}


object PluginVersion {
    const val gradlePlugin = "7.0.4"
    const val kotlin = "1.6.10"
}
//
//dependencies {
//    implementation("com.android.tools.build:gradle:${PluginVersion.gradlePlugin}")
//    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.kotlin}")
//}

