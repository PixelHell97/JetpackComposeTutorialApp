package com.pixel.restarttechnologyassignment.presentation.tutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pixel.restarttechnologyassignment.ui.theme.Turquoise
import com.pixel.restarttechnologyassignment.ui.theme.myFontFamily

@Composable
fun TutorialOverlay(
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var numberOfSteps by remember { mutableIntStateOf(0) }

    when (numberOfSteps) {
        0 -> {
            WelcomeTutorial(modifier) {
                numberOfSteps++
            }
        }

        1 -> {
            HomeNavTutorial {
                numberOfSteps++
            }
        }

        2 -> {
            numberOfSteps++
        }

        3 -> {
            numberOfSteps++
        }

        4 -> {
            numberOfSteps++
        }

        5 -> {
            onDismiss.invoke()
        }
    }
}

@Composable
fun WelcomeTutorial(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier =
            modifier
                .fillMaxSize()
                .background(Color(0x99090e18))
                .clickable { onDismiss.invoke() },
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(30.dp),
        ) {
            Text(
                text = "welcome to:  how to use and enjoy Examate",
                color = Color.White,
                fontSize = 12.sp,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Normal,
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Tap anywhere on the screen to continue ",
                color = Turquoise,
                fontSize = 20.sp,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeNavTutorial(
    modifier: Modifier = Modifier,
    onDismiss: () -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier =
            modifier
                .fillMaxSize()
                .background(Color(0x66090e18))
                .clickable { onDismiss.invoke() },
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier =
                Modifier
                    .background(Color(0xFFEEEEEE), shape = RoundedCornerShape(6.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp),
        ) {
            Text(
                text = "tag",
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF757575),
            )
        }


    }
}

@Preview
@Composable
private fun HomeNavTutorialPrev() {
    HomeNavTutorial(onDismiss = {})
}
