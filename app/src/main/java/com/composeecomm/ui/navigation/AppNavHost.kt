package com.composeecomm.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import com.composeecomm.screen.FirstScreen
import com.composeecomm.screen.SecondScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "firstScreen"
    ) {
        // (1) FirstScreen
        composable(route = "firstScreen") {
            FirstScreen(navController)
        }

        // (2) SecondScreen
        composable(route = "secondScreen") {
            SecondScreen(navController)
        }
    }
}