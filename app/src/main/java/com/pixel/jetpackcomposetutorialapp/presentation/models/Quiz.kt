package com.pixel.jetpackcomposetutorialapp.presentation.models

import androidx.annotation.DrawableRes

data class Quiz(
    val questionsCompleted: Int,
    val totalQuestions: Int,
    val category: String,
    val progressPercentage: Int,
    @DrawableRes val icon: Int,
)
