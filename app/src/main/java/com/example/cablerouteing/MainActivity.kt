package com.example.cablerouteing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cablerouteing.ui.login.LoginScreen
import com.example.cablerouteing.ui.theme.CableRouteingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CableRouteingTheme {
                LoginScreen()
            }
        }
    }
}