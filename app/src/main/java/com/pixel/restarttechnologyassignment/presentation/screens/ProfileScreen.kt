package com.pixel.restarttechnologyassignment.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pixel.restarttechnologyassignment.ui.theme.Gray

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Coming Soon",
            style = MaterialTheme.typography.headlineMedium,
            color = Gray,
        )
    }
}
