package com.example.loteriamexicanaapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loteriamexicanaapp.R

@Composable
fun LoteriaScreen(navController: NavController){
    val color = Color(0xFFFFC300)
    val color2 = Color(0xFFE53935)

    val cartas = listOf(
        R.drawable._1,
        R.drawable._2,
        R.drawable._3,
        R.drawable._4,
        R.drawable._5,
        R.drawable._6,
        R.drawable._7,
        R.drawable._8,
        R.drawable._9,
        R.drawable._10
    )

    var currentCarta by remember { mutableStateOf(cartas.random()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        val imageModifier = Modifier.fillMaxWidth().size(250.dp)

        Image(painter = painterResource(id = currentCarta),
            contentDescription = stringResource(id = R.string.app_name),
            contentScale = ContentScale.Fit,
            modifier = imageModifier)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            currentCarta = cartas.random()
        },
            modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.textButtonColors(containerColor = color, contentColor = Color.Black)) {
            Text("Siguiente carta")
        }

        Button(onClick = {
            navController.navigate("main_screen")
        },
            modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.textButtonColors(containerColor = color2, contentColor = Color.White)) {
            Text("Terminar juego")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLoteriaScreen(){
    val navController = rememberNavController()
    LoteriaScreen(navController)
}