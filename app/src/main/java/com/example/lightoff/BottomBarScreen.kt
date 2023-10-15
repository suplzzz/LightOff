package com.example.lightoff

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource

sealed class BottomBarScreen(
    val route: String,
    val icon: @Composable () -> ImageVector
) {

    object Geo : BottomBarScreen(
        route = "Геолокация",
        icon = { ImageVector.vectorResource(R.drawable.geo) }

    )

    object Food : BottomBarScreen(
        route = "Еда",
        icon = { ImageVector.vectorResource(R.drawable.food) }

    )

    object Main : BottomBarScreen(
        route = "Главная",
        icon = { ImageVector.vectorResource(R.drawable.home2) }
    )

    object Settings : BottomBarScreen(
        route = "Настройки",
        icon = { ImageVector.vectorResource(R.drawable.settings) }
    )
}

