package com.app.navigationbasics.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.navigationbasics.navigation.AUTHENTICATION_ROUTE
import com.app.navigationbasics.navigation.Screen
import com.app.navigationbasics.screens.LoginScreen
import com.app.navigationbasics.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
){
    // nested navigation
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ){
        composable(
            route = Screen.Login.route
        ){
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navController = navController)
        }
    }
}