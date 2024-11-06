package com.pixel.restarttechnologyassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pixel.restarttechnologyassignment.presentation.component.BottomNavBar
import com.pixel.restarttechnologyassignment.presentation.models.BottomNavItem
import com.pixel.restarttechnologyassignment.presentation.screens.ConnectScreen
import com.pixel.restarttechnologyassignment.presentation.screens.HomeScreen
import com.pixel.restarttechnologyassignment.presentation.screens.ProfileScreen
import com.pixel.restarttechnologyassignment.presentation.screens.QuestionsScreen
import com.pixel.restarttechnologyassignment.presentation.screens.ToolsScreen
import com.pixel.restarttechnologyassignment.ui.theme.BackgroundColor
import com.pixel.restarttechnologyassignment.util.SharedPreferencesManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var showTutorial by remember { mutableStateOf(SharedPreferencesManager(this).isFirstLaunch) }
            // var currentStep by remember { mutableIntStateOf(0) }

            val navController = rememberNavController()

            Scaffold(
                modifier = Modifier.fillMaxSize(),
                bottomBar = { BottomNavBar(navController = navController) },
            ) { innerPadding ->
                NavHost(
                    navController = navController,
                    startDestination = BottomNavItem.Home.route,
                    modifier =
                        Modifier
                            .background(Color.White)
                            .padding(innerPadding),
                ) {
                    composable(BottomNavItem.Home.route) {
                        HomeScreen(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(BackgroundColor),
                        )
                    }
                    composable(BottomNavItem.Connect.route) {
                        ConnectScreen(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(BackgroundColor),
                        )
                    }
                    composable(BottomNavItem.Questions.route) {
                        QuestionsScreen(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(BackgroundColor),
                        )
                    }
                    composable(BottomNavItem.Tools.route) {
                        ToolsScreen(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(BackgroundColor),
                        )
                    }
                    composable(BottomNavItem.Profile.route) {
                        ProfileScreen(
                            modifier =
                                Modifier
                                    .fillMaxSize()
                                    .background(BackgroundColor),
                        )
                    }
                }
            }
        }
    }
}
