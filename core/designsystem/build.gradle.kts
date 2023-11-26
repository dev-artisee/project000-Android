plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dev.designsystem"
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
    composeOptions {
        kotlinCompilerExtensionVersion = com.dev.artisee.Versions.kotlinCompilerExtensionVersion
    }
    buildFeatures {
        compose = true
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
}