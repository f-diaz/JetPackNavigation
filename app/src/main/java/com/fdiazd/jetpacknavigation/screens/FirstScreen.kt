package com.fdiazd.jetpacknavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.fdiazd.jetpacknavigation.navigation.AppScreens


@Composable
fun FirstScreen(navController: NavController){
    Scaffold {
        BodyContent(navController)
    }

}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola navegación")
        Button(onClick = {
            navController.navigate(route=AppScreens.SecondScreen.route + "/Este es un parámetro")
        }) {
            Text("Navega")
        }
    }
}


