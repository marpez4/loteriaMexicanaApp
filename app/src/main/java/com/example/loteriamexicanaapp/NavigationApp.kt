package com.example.loteriamexicanaapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loteriamexicanaapp.ui.screens.MainScreen
import com.example.loteriamexicanaapp.ui.screens.LoteriaScreen

@Composable
fun NavigationApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_screen"){
        composable("main_screen"){
            MainScreen(navController)
        }

        composable("loteria_screen"){
            LoteriaScreen(navController)
        }

    }
}