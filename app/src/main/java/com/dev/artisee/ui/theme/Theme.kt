package com.dev.artisee.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import com.dev.artisee.ui.theme.color.*

val LocalColors = staticCompositionLocalOf { ArtiseeLightColorScheme }

val ArtiseeDarkColorScheme = darkColorScheme(
    primary = DarkDefaultColorScheme.primary,
    secondary = DarkDefaultColorScheme.secondary,
    tertiary = DarkDefaultColorScheme.tertiary
)

val ArtiseeLightColorScheme = lightColorScheme(
    primary = LightDefaultColorScheme.primary,
    secondary = LightDefaultColorScheme.secondary,
    tertiary = LightDefaultColorScheme.tertiary
)

@Composable
fun ArtiseeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true, // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkAndroidColorScheme
        else -> LightAndroidColorScheme
    }

    val artiseeColorScheme = when {
        darkTheme -> ArtiseeDarkColorScheme
        else -> ArtiseeLightColorScheme
    }

    CompositionLocalProvider(LocalColors provides artiseeColorScheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }

}