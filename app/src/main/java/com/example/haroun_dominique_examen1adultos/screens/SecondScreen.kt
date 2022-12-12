package com.example.haroun_dominique_examen1adultos.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController){
    Scaffold {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column() {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Navegación")
        }
    }
}

