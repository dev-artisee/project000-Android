plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dev.my"
    compileSdk = com.dev.artisee.Configuration.compileSdk

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = com.dev.artisee.Versions.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = com.dev.artisee.Versions.kotlinCompilerExtensionVersion
    }
}

dependencies {

    implementation(platform(com.dev.artisee.Libraries.kotlin_bom))
    implementation(com.dev.artisee.Libraries.androidx_core)

    // Compose
    implementation(com.dev.artisee.Libraries.compose_ui)
    implementation(com.dev.artisee.Libraries.ui_tool_preview)
    implementation(com.dev.artisee.Libraries.compose_material)
    implementation(com.dev.artisee.Libraries.compose_material3)
    implementation(com.dev.artisee.Libraries.activity_compose)

    // Navigation
    implementation(com.dev.artisee.Libraries.navigation_compose)
    implementation(com.dev.artisee.Libraries.navigation_fragment)
    implementation(com.dev.artisee.Libraries.navigation_ui)
    implementation(com.dev.artisee.Libraries.navigation_dynamic_feature)

    // Test
    testImplementation(com.dev.artisee.Libraries.junit)
    androidTestImplementation(com.dev.artisee.Libraries.test_ext_junit)
    androidTestImplementation(com.dev.artisee.Libraries.test_espresso)
    androidTestImplementation(platform(com.dev.artisee.Libraries.compose_bom))
    androidTestImplementation(com.dev.artisee.Libraries.ui_test_junit4)
    debugImplementation(com.dev.artisee.Libraries.compose_ui_tooling)
    debugImplementation(com.dev.artisee.Libraries.compose_ui_test_manifest)
}