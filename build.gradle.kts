buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies{
        classpath(com.dev.artisee.Libraries.agp)
        classpath(com.dev.artisee.Libraries.kotlin_gradlePlugin)
        classpath(com.dev.artisee.Libraries.navigation_safeargsPlugin)
        classpath(com.dev.artisee.Libraries.hilt_gradle)
    }
}

plugins {
    id("com.android.application") version com.dev.artisee.Versions.agp apply false
    id("com.android.library") version com.dev.artisee.Versions.agp apply false
    id("org.jetbrains.kotlin.android") version com.dev.artisee.Versions.kotlin apply false
    id("com.google.devtools.ksp") version com.dev.artisee.Versions.ksp apply false
}