package com.pixel.restarttechnologyassignment.presentation.models

import androidx.annotation.DrawableRes
import com.pixel.restarttechnologyassignment.R

sealed class BottomNavItem(
    val route: String,
    val label: String,
    @DrawableRes val icon: Int,
) {
    data object Home : BottomNavItem("home", "Home", R.drawable.ic_home_simple)

    data object Connect : BottomNavItem("connect", "Connect", R.drawable.ic_chat)

    data object Questions : BottomNavItem("questions", "Questions", R.drawable.ic_help)

    data object Tools : BottomNavItem("tools", "Tools", R.drawable.ic_design_nib)

    data object Profile : BottomNavItem("profile", "Profile", R.drawable.ic_profile)
}
