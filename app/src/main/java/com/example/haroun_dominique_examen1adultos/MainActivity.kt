package com.example.haroun_dominique_examen1adultos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.haroun_dominique_examen1adultos.navigation.AppNavigation
import com.example.haroun_dominique_examen1adultos.screens.FirstScreen
import com.example.haroun_dominique_examen1adultos.ui.theme.Haroun_Dominique_examen1AdultosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Haroun_Dominique_examen1AdultosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   AppNavigation()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Haroun_Dominique_examen1AdultosTheme {
        AppNavigation()
    }
}