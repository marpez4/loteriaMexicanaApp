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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.unit.dp
import com.example.loteriamexicanaapp.R

@Composable
fun MainScreen(navController: NavController){
    val color = Color(0xFFFFC300)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        val imageModifier = Modifier.fillMaxWidth().size(250.dp)

        Image(painter = painterResource(id = R.drawable.inicio),
            contentDescription = stringResource(id = R.string.app_name),
            contentScale = ContentScale.Fit,
            modifier = imageModifier)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate("loteria_screen")
        },
            modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.textButtonColors(containerColor = color, contentColor = Color.Black)) {
            Text("Iniciar juego")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
    val navController = rememberNavController()
    MainScreen(navController)
}