
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(GradleClasspath.androidGradlePlugin)
        classpath(GradleClasspath.kotlinGradlePluginClasspath)
        classpath(GradleClasspath.hiltGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
//        classpath(GradleClasspath.googleCrashlytics)
//        classpath(GradleClasspath.googleService)
//        classpath(GradleClasspath.safeArgs)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}


task("clean") {
    delete(rootProject.buildDir)
}
