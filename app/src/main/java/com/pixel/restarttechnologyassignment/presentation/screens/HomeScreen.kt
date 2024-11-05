package com.pixel.restarttechnologyassignment.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pixel.restarttechnologyassignment.presentation.component.ItemPlan
import com.pixel.restarttechnologyassignment.presentation.component.planList
import com.pixel.restarttechnologyassignment.presentation.models.Plan
import com.pixel.restarttechnologyassignment.ui.theme.HeaderTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.TextTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.Turquoise
import com.pixel.restarttechnologyassignment.ui.theme.myFontFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().padding(8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Home",
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = HeaderTurquoise,
            )

            IconButton(
                onClick = { /* TODO: Handle button click */ },
                modifier = Modifier.padding(start = 8.dp),
            ) {
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "Filter partners",
                    tint = Turquoise,
                    modifier = Modifier.size(24.dp),
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text =
                buildAnnotatedString {
                    withStyle(
                        style =
                            SpanStyle(
                                color = Color(0xFF374151),
                                fontSize = 20.sp,
                                fontFamily = myFontFamily,
                                fontWeight = FontWeight.Medium,
                            ),
                    ) {
                        append("Hi ")
                    }
                    // Here we will replace the text with a name from the user object
                    append("UserName")
                },
            color = TextTurquoise,
            fontSize = 20.sp,
            fontFamily = myFontFamily,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Study Plan",
            color = Color(0xFF146D6D),
            fontSize = 20.sp,
            fontFamily = myFontFamily,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(24.dp))

        PlansList(
            plansList = planList,
        )
    }
}

@Composable
fun PlansList(plansList: List<Plan>) {
    LazyColumn {
        items(plansList) { plan ->
            ItemPlan(
                plan = plan,
                isLastItem = plansList.last() == plan,
                onClick = {
                    // TODO: Handle item click
                },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPrev() {
    HomeScreen()
}
