package com.pixel.jetpackcomposetutorialapp

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
import com.pixel.jetpackcomposetutorialapp.highlightor.Highlightor
import com.pixel.jetpackcomposetutorialapp.presentation.component.BottomNavBar
import com.pixel.jetpackcomposetutorialapp.presentation.models.BottomNavItem
import com.pixel.jetpackcomposetutorialapp.presentation.screens.ConnectScreen
import com.pixel.jetpackcomposetutorialapp.presentation.screens.HomeScreen
import com.pixel.jetpackcomposetutorialapp.presentation.screens.ProfileScreen
import com.pixel.jetpackcomposetutorialapp.presentation.screens.QuestionsScreen
import com.pixel.jetpackcomposetutorialapp.presentation.screens.ToolsScreen
import com.pixel.jetpackcomposetutorialapp.ui.theme.BackgroundColor
import com.pixel.jetpackcomposetutorialapp.util.SharedPreferencesManager

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var showTutorial by remember { mutableStateOf(SharedPreferencesManager(this).isFirstLaunch) }
            // var currentStep by remember { mutableIntStateOf(0) }
            val tutorialSteps =
                listOf(
                    "Vous trouverez ici votre plan d'étude",
                    "Vous trouverez ici des partenaires d'étude et des personnes avec qui vous connecter",
                    "Voici les questions avec des réponses modèles",
                    "Cliquez ici pour voir par catégories avec progression",
                )

            val navController = rememberNavController()

            Highlightor(
                showHighlightor = showTutorial,
                onCompleted = {
                    showTutorial = false
                    SharedPreferencesManager(this).isFirstLaunch = false
                    navController.navigate(BottomNavItem.Home.route)
                },
            ) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavBar(
                            navController = navController,
                            modifier = { index, nextStep ->
                                Modifier.highlightor(
                                    index = index,
                                    description = tutorialSteps[index],
                                    onNextClick = nextStep,
                                )
                            },
                        )
                    },
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
                                tutorialModifier =
                                    Modifier.highlightor(
                                        index = 3,
                                        description = tutorialSteps[3],
                                    ),
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
}
