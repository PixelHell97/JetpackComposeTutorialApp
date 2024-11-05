package com.pixel.restarttechnologyassignment.presentation.tutorial

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun TutorialOverlay(modifier: Modifier = Modifier) {
    var currentStep by remember { mutableIntStateOf(0) }
    val tutorialSteps = listOf("This is your profile icon", "This is the search bar", "This button takes you to settings")

    if (currentStep < tutorialSteps.size) {
        TooltipOverlay(
            message = tutorialSteps[currentStep],
        )
    }
}
