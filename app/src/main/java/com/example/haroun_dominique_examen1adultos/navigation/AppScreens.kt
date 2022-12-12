package com.example.haroun_dominique_examen1adultos.navigation

sealed class AppScreens(val route:String){
    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("second_screen")
    object ThirdScreen: AppScreens("third_screen")
    object FourthScreen: AppScreens("fourth_screen")
}
