package com.pixel.jetpackcomposetutorialapp.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pixel.jetpackcomposetutorialapp.R
import com.pixel.jetpackcomposetutorialapp.presentation.component.PartnerCardView
import com.pixel.jetpackcomposetutorialapp.presentation.component.partner
import com.pixel.jetpackcomposetutorialapp.presentation.models.Partner
import com.pixel.jetpackcomposetutorialapp.ui.theme.Gray
import com.pixel.jetpackcomposetutorialapp.ui.theme.HeaderTurquoise
import com.pixel.jetpackcomposetutorialapp.ui.theme.Turquoise
import com.pixel.jetpackcomposetutorialapp.ui.theme.myFontFamily
import kotlinx.coroutines.launch

@Composable
fun ConnectScreen(modifier: Modifier = Modifier) {
    val tabsList =
        listOf(
            "Suggestions",
            "Chat",
        )
    val scope = rememberCoroutineScope()
    val pagerState =
        rememberPagerState(pageCount = { tabsList.size })
    val selectedTabIndex by remember { derivedStateOf { pagerState.currentPage } }

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.padding(16.dp),
    ) {
        Text(
            text = "Connect",
            style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold),
            color = HeaderTurquoise,
            modifier = Modifier.padding(top = 16.dp),
        )

        Spacer(modifier = Modifier.height(8.dp))

        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Transparent,
            contentColor = Color.Transparent,
            divider = {},
            indicator = { tabPositions ->
                if (selectedTabIndex < tabPositions.size) {
                    SecondaryIndicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = Turquoise,
                    )
                }
            },
        ) {
            tabsList.forEachIndexed { index, title ->
                Tab(
                    text = {
                        Text(
                            text = title,
                            fontFamily = myFontFamily,
                            fontWeight = if (selectedTabIndex == index) FontWeight.Bold else FontWeight.Medium,
                            fontSize = 16.sp,
                        )
                    },
                    selected = selectedTabIndex == index,
                    onClick = {
                        scope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
                    selectedContentColor = Turquoise,
                    unselectedContentColor = Gray,
                )
            }
        }

        HorizontalPager(
            state = pagerState,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .weight(1f),
        ) { page ->
            when (page) {
                0 -> {
                    SuggestionsPage(
                        partnersList =
                            listOf(
                                partner,
                                partner,
                                partner,
                                partner,
                            ),
                    )
                }

                1 -> {
                    ChatPage()
                }
            }
        }
    }
}

@Composable
fun SuggestionsPage(
    partnersList: List<Partner>,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Suggested Study Partners:",
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = HeaderTurquoise,
            )

            IconButton(
                onClick = { /* TODO: Handle button click */ },
                modifier = Modifier.padding(start = 8.dp),
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_filter_list),
                    contentDescription = "Filter partners",
                    tint = Turquoise,
                )
            }
        }
        LazyColumn {
            items(partnersList) { partner ->
                PartnerCardView(
                    partner = partner,
                    onClick = { /* TODO: Handle item click */ },
                )
            }
        }
    }
}

@Composable
fun ChatPage(modifier: Modifier = Modifier) {
    Box(
        modifier =
            modifier
                .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "You have no chat yet",
            style = MaterialTheme.typography.headlineMedium,
            color = Gray,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ConnectPrev() {
    ConnectScreen()
}
