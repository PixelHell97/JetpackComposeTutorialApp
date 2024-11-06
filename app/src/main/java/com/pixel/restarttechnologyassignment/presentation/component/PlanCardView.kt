package com.pixel.restarttechnologyassignment.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pixel.restarttechnologyassignment.presentation.models.Plan
import com.pixel.restarttechnologyassignment.ui.theme.Gray
import com.pixel.restarttechnologyassignment.ui.theme.LightTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.myFontFamily

@Composable
fun PlanCardView(
    plan: Plan,
    isLastItem: Boolean,
    onClick: (plan: Plan) -> Unit,
    modifier: Modifier = Modifier,
) {
    val contentPrimaryColor = if (plan.isLocked) Gray else Color(0xFF29E4E4)
    val contentSecondaryColor = if (plan.isLocked) Gray else LightTurquoise
    val positionColor = if (plan.isLocked) Color.White else Color(0xFF29E4E4)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier =
            modifier
                .fillMaxWidth()
                .padding(horizontal = 6.dp)
                .clickable {
                    onClick.invoke(plan)
                },
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box {
                Surface(
                    modifier =
                        Modifier
                            .size(82.dp)
                            .clip(RoundedCornerShape(100))
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
                    shape = CircleShape,
                ) {
                    Box(
                        modifier =
                            Modifier
                                .background(contentSecondaryColor),
                    ) {
                        Text(
                            text = plan.number.toString(),
                            color = positionColor,
                            fontSize = 33.sp,
                            fontFamily = myFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier =
                                Modifier
                                    .align(Alignment.Center),
                        )
                    }
                }

                if (plan.isLocked) {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = "Locked",
                        tint = Color.White,
                        modifier =
                            Modifier
                                .size(24.dp)
                                .clip(RoundedCornerShape(100))
                                .background(Gray)
                                .padding(4.dp)
                                .align(Alignment.BottomEnd),
                    )
                }
            }

            if (!isLastItem) {
                Spacer(
                    modifier =
                        Modifier
                            .size(width = 12.dp, height = 24.dp)
                            .background(contentSecondaryColor),
                )
            }
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = plan.title,
                color = contentPrimaryColor,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )
            if (plan.description.isNotEmpty()) {
                Text(
                    text = plan.description,
                    color = contentPrimaryColor,
                    fontFamily = myFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ItemPlanPrev() {
    Column {
        planList.forEach { plan ->
            PlanCardView(
                plan = plan,
                isLastItem = planList.last() == plan,
                onClick = { /* TODO: Handle item click */ },
            )
        }
    }
}

internal val planList =
    listOf(
        Plan(number = 1, title = "Unite 1", description = "what is examate", isLocked = false),
        Plan(number = 2, title = "Unite 2", description = "what is TCF", isLocked = true),
        Plan(number = 3, title = "Writing Tasks", description = "", isLocked = true),
    )
