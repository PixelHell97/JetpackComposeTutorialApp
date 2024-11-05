package com.pixel.restarttechnologyassignment.presentation.models

data class Plan(
    val name: String,
    val description: String,
    val isUnlocked: Boolean = false,
)
