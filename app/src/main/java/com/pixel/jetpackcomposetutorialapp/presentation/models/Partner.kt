package com.pixel.jetpackcomposetutorialapp.presentation.models

import android.net.Uri

data class Partner(
    val name: String,
    val profilePicture: Uri? = null,
    val targetingLevel: String,
    val lastSeen: String,
    val languages: List<String>,
    val location: String,
    val gender: String,
    val age: Int,
    val joinDate: String,
)
