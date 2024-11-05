package com.pixel.restarttechnologyassignment.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pixel.restarttechnologyassignment.R

// Set of Material typography styles to start with
val Typography =
    Typography(
        bodyLarge =
            TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp,
            ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
     */
    )

val myFontFamily =
    FontFamily(
        Font(
            resId = R.font.montserrat_bold,
            weight = FontWeight.Bold,
        ),
        Font(
            resId = R.font.montserrat_light,
            weight = FontWeight.Light,
        ),
        Font(
            resId = R.font.montserrat_medium,
            weight = FontWeight.Medium,
        ),
        Font(
            resId = R.font.montserrat_regular,
            weight = FontWeight.Normal,
        ),
        Font(
            resId = R.font.montserrat_thin,
            weight = FontWeight.Thin,
        ),
    )
