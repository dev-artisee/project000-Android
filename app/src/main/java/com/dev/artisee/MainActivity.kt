package com.dev.artisee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.dev.artisee.ui.ArtiseeApp
import com.dev.designsystem.theme.ArtiseeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtiseeTheme {
                ArtiseeApp(
                    windowSizeClass = calculateWindowSizeClass(this)
                )
            }
        }
    }
}
