package com.example.android_auto_repair.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val RepairColorScheme = darkColorScheme(

    primary = RepairRed,
    onPrimary = RepairWhite,

    secondary = RepairRedDark,
    onSecondary = RepairWhite,

    tertiary = RepairRed,
    onTertiary = RepairWhite,

    background = RepairBlack,
    onBackground = RepairWhite,

    surface = RepairSurface,
    onSurface = RepairWhite,

    surfaceVariant = RepairSurface,
    onSurfaceVariant = RepairGray,

    outline = RepairRed
)

@Composable
fun Android_auto_repairTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = RepairColorScheme,
        typography = Typography,
        content = content
    )
}