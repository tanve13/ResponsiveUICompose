package com.tanveer.responsiveuicompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tanveer.responsiveuicompose.Screens.DetailScreen
import com.tanveer.responsiveuicompose.Screens.HomeScreen

sealed class Screen(val route:String){
    object Home : Screen("Home")
    object Details:Screen("details")

}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()){
    NavHost(navController = navController, startDestination = Screen.Home.route ){
        composable(Screen.Home.route){
            HomeScreen(navController)
        }
        composable(Screen.Details.route){
            DetailScreen()
        }
    }
}