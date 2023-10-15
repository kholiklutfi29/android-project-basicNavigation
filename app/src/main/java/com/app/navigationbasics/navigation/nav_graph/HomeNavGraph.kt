package com.app.navigationbasics.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.app.navigationbasics.navigation.DETAIL_ARGUMENT_KEY
import com.app.navigationbasics.navigation.DETAIL_ARGUMENT_KEY2
import com.app.navigationbasics.navigation.HOME_ROUTE
import com.app.navigationbasics.navigation.Screen
import com.app.navigationbasics.screens.DetailScreen
import com.app.navigationbasics.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY){
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2){
                    type = NavType.StringType
                    defaultValue = "Kholik"
                }
            )
        ){
            Log.d("Arg",it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Arg",it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController = navController)
        }
    }
}