package com.pixel.restarttechnologyassignment.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val Turquoise = Color(0xFF21B6B6)
val LightTurquoise = Color(0xFFDDFBFB)
val TextTurquoise = Color(0xFF0F5252)
val HeaderTurquoise = Color(0xFF188888)
val Gray = Color(0xff9ca3af)

val BackgroundColor =
    Brush.linearGradient(
        colorStops =
            arrayOf(
                0.0f to LightTurquoise,
                0.2f to Color.White,
                0.8f to Color.White,
                1.0f to LightTurquoise,
            ),
        start = Offset(1200.0f, 0.0f),
        end = Offset(0.0f, 2500.0f),
    )
