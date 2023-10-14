package com.example.lightoff

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lightoff.ui.screens.FoodScreen
import com.example.lightoff.ui.screens.Main
import com.example.lightoff.ui.screens.ProfileScreen
import com.example.lightoff.ui.screens.SettingsScreen


@Composable
fun BottomNavigationGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Main.route
    ){

        composable(route = BottomBarScreen.Profile.route){
        ProfileScreen()
        }

        composable(route = BottomBarScreen.Food.route){
            FoodScreen()
        }

        composable(route = BottomBarScreen.Main.route){
            Main()
        }

        composable(route = BottomBarScreen.Settings.route){
            SettingsScreen()
        }
    }
}