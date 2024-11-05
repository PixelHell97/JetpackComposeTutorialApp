package com.pixel.restarttechnologyassignment.presentation.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties

@Composable
fun TooltipTutorialOverlay() {
    var currentStep by remember { mutableStateOf(0) }
    val tutorialSteps =
        listOf(
            "Vous trouverez ici votre plan d'étude",
            "Vous trouverez ici des partenaires d'étude et des personnes avec qui vous connecter",
            "Voici les questions avec des réponses modèles",
            "Vous pouvez filtrer pour voir un type exact de questions",
            "Cliquez ici pour voir par catégories avec progression",
        )

    if (currentStep < tutorialSteps.size) {
//        TooltipOverlayAt(
//            message = tutorialSteps[currentStep],
//            onNext = { currentStep++ },
//        )
    }
}

@Composable
fun TooltipOverlayAt(
    message: String,
    onNext: () -> Unit,
    xOffset: Int,
    yOffset: Int,
) {
    Popup(
        alignment = Alignment.TopStart,
        offset = IntOffset(xOffset, yOffset),
        properties = PopupProperties(focusable = false),
    ) {
        Box(
            modifier =
                Modifier
                    .background(Color.White, shape = CircleShape)
                    .padding(16.dp)
                    .clickable(onClick = onNext),
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = message, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

@Preview(name = "TooltipTutorialOverlay")
@Composable
private fun PreviewTooltipTutorialOverlay() {
    TooltipTutorialOverlay()
}
