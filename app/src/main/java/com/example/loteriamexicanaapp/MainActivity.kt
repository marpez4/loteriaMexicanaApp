package com.example.loteriamexicanaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.loteriamexicanaapp.ui.theme.LoteriaMexicanaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoteriaMexicanaAppTheme {
                NavigationApp()
            }
        }
    }
}