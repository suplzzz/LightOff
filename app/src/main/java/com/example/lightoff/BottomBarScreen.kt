package com.example.lightoff

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource

sealed class BottomBarScreen(
    val route: String,
    var title: String,
    val icon: (@Composable () -> ImageVector)
) {

    object Profile : BottomBarScreen(
        route = "Профиль",
        title = "Профиль",
        icon = { ImageVector.vectorResource(R.drawable.geo) }

    )

    object Food : BottomBarScreen(
        route = "Еда",
        title = "Еда",
        icon = { ImageVector.vectorResource(R.drawable.food) }

    )

    object Main : BottomBarScreen(
        route = "Главная",
        title = "Главная",
        { ImageVector.vectorResource(R.drawable.home2) }
    )

    object Settings : BottomBarScreen(
        route = "Настройки",
        title = "Настройки",
        icon = { ImageVector.vectorResource(R.drawable.settings) }
    )
}

