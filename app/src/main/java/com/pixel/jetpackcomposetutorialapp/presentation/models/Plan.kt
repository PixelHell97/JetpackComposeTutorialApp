package com.pixel.jetpackcomposetutorialapp.presentation.models

data class Plan(
    val number: Int,
    val title: String,
    val description: String,
    val isLocked: Boolean = false,
)
