package com.pixel.restarttechnologyassignment.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pixel.restarttechnologyassignment.presentation.models.Plan
import com.pixel.restarttechnologyassignment.ui.theme.Gray
import com.pixel.restarttechnologyassignment.ui.theme.LightTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.Turquoise

@Composable
fun ItemPlan(
    position: Int,
    plan: Plan,
    modifier: Modifier = Modifier,
) {
    val contentPrimaryColor = if (plan.isUnlocked) Turquoise else Gray
    val contentSecondaryColor = if (plan.isUnlocked) LightTurquoise else Gray
    val positionColor = if (plan.isUnlocked) Turquoise else Color.White

    Row(
        modifier =
            modifier
                .fillMaxWidth()
                .padding(16.dp),
    ) {
        Box(
            modifier = Modifier,
        ) {
            Box(
                modifier =
                    Modifier
                        .clip(RoundedCornerShape(100))
                        .size(82.dp)
                        .background(contentPrimaryColor)
                        .padding(6.dp)
                        .clip(RoundedCornerShape(100))
                        .background(Color.White)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(100))
                        .background(contentPrimaryColor)
                        .padding(2.dp)
                        .clip(RoundedCornerShape(100))
                        .background(contentSecondaryColor),
            ) {
                Text(
                    text = position.toString(),
                    color = positionColor,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
                if (!plan.isUnlocked) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Locked",
                        tint = Color.White,
                        modifier =
                            Modifier
                                .size(16.dp)
                                .padding(top = 4.dp)
                                .clip(RoundedCornerShape(100))
                                .background(Gray)
                                .align(Alignment.BottomEnd),
                    )
                }
            }

            Spacer(
                modifier =
                    Modifier
                        .size(width = 12.dp, height = 24.dp)
                        .background(contentSecondaryColor),
            )
        }
    }
}

@Preview
@Composable
private fun ItemPlanPrev() {
    ItemPlan(
        position = 1,
        plan = Plan("name", "description", false),
    )
}
