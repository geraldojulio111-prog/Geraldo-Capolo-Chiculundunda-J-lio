package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = GsgGoldPrimary,
    onPrimary = GsgNavyPrimary,
    primaryContainer = GsgNavyCard,
    onPrimaryContainer = GsgGoldLight,
    secondary = GsgGoldLight,
    onSecondary = GsgNavyPrimary,
    secondaryContainer = GsgNavySecondary,
    onSecondaryContainer = Color.White,
    tertiary = GsgGoldDark,
    background = GsgNavyPrimary,
    onBackground = GsgTextLight,
    surface = GsgNavySurface,
    onSurface = GsgTextLight,
    surfaceVariant = GsgNavyCard,
    onSurfaceVariant = GsgTextLightMuted,
    outline = GsgGoldMuted,
    outlineVariant = Color(0xFF223A61)
)

private val LightColorScheme = lightColorScheme(
    primary = GsgNavyPrimary,
    onPrimary = Color.White,
    primaryContainer = GsgNavySecondary,
    onPrimaryContainer = Color.White,
    secondary = GsgGoldPrimary,
    onSecondary = GsgNavyPrimary,
    secondaryContainer = Color(0xFFFFF3D6),
    onSecondaryContainer = GsgNavyPrimary,
    tertiary = GsgGoldDark,
    background = GsgBackgroundLight,
    onBackground = GsgTextPrimaryDark,
    surface = GsgSurfaceLight,
    onSurface = GsgTextPrimaryDark,
    surfaceVariant = GsgSurfaceVariantLight,
    onSurfaceVariant = GsgTextSecondaryDark,
    outline = Color(0xFFCBD5E1),
    outlineVariant = Color(0xFFE2E8F0)
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
