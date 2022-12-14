package com.example.haroun_dominique_examen1adultos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.haroun_dominique_examen1adultos.screens.FirstScreen
import com.example.haroun_dominique_examen1adultos.screens.FourthScreen
import com.example.haroun_dominique_examen1adultos.screens.SecondScreen
import com.example.haroun_dominique_examen1adultos.screens.ThirdScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.ThirdScreen.route){
            ThirdScreen(navController)
        }
        composable(route = AppScreens.FourthScreen.route){
            FourthScreen(navController)
        }
    }


}