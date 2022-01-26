
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(GradleClasspath.androidGradlePlugin)
        classpath(GradleClasspath.kotlinGradlePluginClasspath)
        classpath(GradleClasspath.hiltGradlePlugin)
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
