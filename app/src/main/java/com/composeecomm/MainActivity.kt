package com.composeecomm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.composeecomm.ui.navigation.AppNavHost
import com.composeecomm.ui.theme.ComposeEcommerceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeEcommerceTheme {
                AppNavHost(navController = rememberNavController())
            }
        }
    }
}
