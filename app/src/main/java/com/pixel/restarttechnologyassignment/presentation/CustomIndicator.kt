package com.pixel.restarttechnologyassignment.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TabPosition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pixel.restarttechnologyassignment.ui.theme.HeaderTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.LightTurquoise

@Composable
fun CustomIndicator(
    tabPositions: List<TabPosition>,
    selectedTabIndex: Int,
) {
    tabPositions.forEachIndexed { index, tabPosition ->
        Box(
            Modifier
                .offset(x = tabPosition.left)
                .wrapContentSize(align = Alignment.BottomStart)
                .width(tabPosition.right - tabPosition.left)
                .padding(2.dp)
                .fillMaxSize()
                .background(
                    color = if (index == selectedTabIndex) HeaderTurquoise else LightTurquoise,
                    RoundedCornerShape(50),
                ),
        )
    }
}
