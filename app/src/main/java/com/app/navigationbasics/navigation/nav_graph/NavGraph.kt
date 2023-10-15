package com.app.navigationbasics.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.app.navigationbasics.navigation.HOME_ROUTE
import com.app.navigationbasics.navigation.ROOT_ROUTE
import com.app.navigationbasics.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavController
){
    NavHost(
        navController = navController as NavHostController,
        startDestination = HOME_ROUTE, // -> will start from the navigation that contains route "HOME_ROUTE"
        route = ROOT_ROUTE
    ){
        // nested navigation
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}
