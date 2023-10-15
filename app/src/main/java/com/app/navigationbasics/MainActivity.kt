package com.app.navigationbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.app.navigationbasics.navigation.nav_graph.SetupNavGraph
import com.app.navigationbasics.ui.theme.NavigationBasicsTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationBasicsTheme {

                navController = rememberNavController()

                navController?.let {
                    SetupNavGraph(navController = it)
                }
            }
        }
    }
}

