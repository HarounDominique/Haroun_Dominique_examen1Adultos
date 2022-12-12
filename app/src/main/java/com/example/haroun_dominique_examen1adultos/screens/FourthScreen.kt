package com.example.haroun_dominique_examen1adultos.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.haroun_dominique_examen1adultos.navigation.AppScreens
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun FourthScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar() {
            Text("FourthScreen")
        }
    }) {
        FourthBodyContent(navController)
    }
}

@Composable
fun FourthBodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Volver atrás")
        }
    }
}
