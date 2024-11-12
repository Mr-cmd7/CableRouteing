package com.example.cablerouteing.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {
    val emailState= remember {
        mutableStateOf("")
    }
    val passwordState= remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        TextField(value = emailState.value, placeholder = { Text("Enter Email")},
            onValueChange = {
            emailState.value = it
        }, )
        Spacer(modifier = Modifier.height(10.dp))
        TextField( value = passwordState.value,placeholder = { Text("Enter Password")},
            onValueChange = {
            passwordState.value = it
        })
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {

        }) {
            Text(text = "Sing Up")
        }
    }
}