import com.dev.artisee.Libraries
import com.dev.artisee.Versions
import com.dev.artisee.Configuration

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("com.google.devtools.ksp")
}

android {
    namespace = Configuration.applicationId
    compileSdk = Configuration.compileSdk

    defaultConfig {
        applicationId = Configuration.applicationId
        minSdk = Configuration.minSdk
        targetSdk = Configuration.targetSdk
        versionCode = Configuration.versionCode
        versionName = Configuration.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Versions.jvmTarget
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.kotlinCompilerExtensionVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(platform(Libraries.kotlin_bom))
    implementation(Libraries.androidx_core)

    // Compose
    implementation(Libraries.compose_ui)
    implementation(Libraries.ui_tool_preview)
    implementation(Libraries.compose_material)
    implementation(Libraries.compose_material3)
    implementation(Libraries.activity_compose)

    // LifeCycle
    implementation(Libraries.lifecycle_runtime)
    implementation(Libraries.lifecycle_viewmodel)

    // Coil
    implementation(Libraries.coil_compose)

    // Navigation
    implementation(Libraries.navigation_compose)
    implementation(Libraries.navigation_fragment)
    implementation(Libraries.navigation_ui)
    implementation(Libraries.navigation_dynamic_feature)

    // Hilt
    implementation(Libraries.hilt_android)
    implementation(Libraries.hilt_navigation_fragment)

    // Timber
    implementation(Libraries.timber)

    // Retrofit
    implementation(Libraries.retrofit2)
    implementation(Libraries.okhttp3)
    implementation(Libraries.retrofit2_adapter)

    // Gson
    implementation(Libraries.gson)
    implementation(Libraries.material3_window_size)

    // Test
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.test_ext_junit)
    androidTestImplementation(Libraries.test_espresso)
    androidTestImplementation(platform(Libraries.compose_bom))
    androidTestImplementation(Libraries.ui_test_junit4)
    debugImplementation(Libraries.compose_ui_tooling)
    debugImplementation(Libraries.compose_ui_test_manifest)
}