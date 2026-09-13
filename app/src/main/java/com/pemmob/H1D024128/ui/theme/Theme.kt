package com.pemmob.H1D024128.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,

    secondary = Secondary,
    onSecondary = Color.White,

    tertiary = Color.White,
    onTertiary = Color.White,

    background = Color(0xFF212121),
    onBackground = Color.White,

    surface = Color(0xFF3E3E3E),
    onSurface = Color.White,

    surfaceVariant = Color(0xFF202020),
    onSurfaceVariant = Color(0xFFE0E0E0)
)

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,

    secondary = Secondary,
    onSecondary = Color.White,

    tertiary = Color.White,
    onTertiary = Color.White,

    background = Background,
    onBackground = Color.Black,

    surface = Surface,
    onSurface = Color.Black,

    surfaceVariant = Color(0xFFE7E7E7),
    onSurfaceVariant = Color.Black
)

@Composable
fun JualanTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}