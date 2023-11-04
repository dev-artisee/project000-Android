package com.dev.artisee

object Versions {

    const val agp = "8.1.1"
    const val ksp = "1.8.10-1.0.9"
    const val kotlin = "1.8.0"
    const val jvmTarget = "11"
    const val kotlinCompilerExtensionVersion = "1.4.3"

    const val activity_compose = "1.6.1"
    const val compose_ui = "1.4.1"
    const val nav = "2.5.3"
    const val nav_compose = "2.4.2"
    const val coil = "2.2.0"
    const val hilt = "2.45"
    const val hilt_nav_fragment = "1.0.0"
    const val timber = "5.0.1"
    const val lifecycle = "2.6.1"
    const val retrofit = "2.9.0"
    const val gson = "2.10.1"
    const val compose_material = "1.0.1"
    const val compose_material3 = "1.1.2"
    const val androidxNavigation = "2.5.0"
    const val junit = "4.13.2"
    const val test_ext_junit = "1.1.5"
    const val test_espresso = "3.5.1"
    const val compose_bom = "2023.03.00"
    const val window_size = "1.1.2"
}

object Libraries {

    const val agp = "com.android.tools.build:gradle:${Versions.agp}"
    const val ksp = "com.google.devtools.ksp:symbol-processing-api:${Versions.ksp}"
    const val androidx_core = "androidx.core:core-ktx:${Versions.kotlin}"
    const val kotlin_bom = "org.jetbrains.kotlin:kotlin-bom:${Versions.kotlin}"
    const val kotlin_gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"

    // Compose
    const val compose_ui = "androidx.compose.ui:ui:${Versions.compose_ui}"
    const val ui_tool_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose_ui}"
    const val compose_material = "androidx.compose.material:material:${Versions.compose_material}"
    const val compose_material3 = "androidx.compose.material3:material3:${Versions.compose_material3}"
    const val activity_compose = "androidx.activity:activity-compose:${Versions.activity_compose}"

    // LifeCycle
    const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    // Coil
    const val coil_compose = "io.coil-kt:coil-compose:${Versions.coil}"

    // Navigation
    const val navigation_runtime = "androidx.navigation:navigation-runtime-ktx:${Versions.nav}"
    const val navigation_compose = "androidx.navigation:navigation-compose:${Versions.nav}"
    const val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val navigation_dynamic_feature = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.nav}"
    const val navigation_safeargsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidxNavigation}"
    const val material3_window_size = "androidx.compose.material3:material3-window-size-class:${Versions.window_size}"

    // Hilt
    const val hilt_gradle = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val hilt_android = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hilt_navigation_fragment = "androidx.hilt:hilt-navigation-fragment:${Versions.hilt_nav_fragment}"
    const val ksp_hilt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

    // Timber
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Retrofit
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val okhttp3 = "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2"
    const val retrofit2_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

    // Gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    // Test
    const val junit = "junit:junit:${Versions.junit}"
    const val test_ext_junit = "androidx.test.ext:junit:${Versions.test_ext_junit}"
    const val test_espresso = "androidx.test.espresso:espresso-core:${Versions.test_espresso}"
    const val compose_bom = "androidx.compose:compose-bom:${Versions.compose_bom}"
    const val ui_test_junit4 = "androidx.compose.ui:ui-test-junit4:${Versions.compose_ui}"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose_ui}"
    const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose_ui}"

}