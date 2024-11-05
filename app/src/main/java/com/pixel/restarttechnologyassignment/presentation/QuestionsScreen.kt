package com.pixel.restarttechnologyassignment.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pixel.restarttechnologyassignment.R
import com.pixel.restarttechnologyassignment.presentation.component.ItemOralCard
import com.pixel.restarttechnologyassignment.presentation.component.ItemQuizCardView
import com.pixel.restarttechnologyassignment.presentation.component.oral
import com.pixel.restarttechnologyassignment.presentation.component.quiz
import com.pixel.restarttechnologyassignment.presentation.models.Oral
import com.pixel.restarttechnologyassignment.presentation.models.Quiz
import com.pixel.restarttechnologyassignment.presentation.models.TabItem
import com.pixel.restarttechnologyassignment.ui.generatedIcons.MyIconPack
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Mic
import com.pixel.restarttechnologyassignment.ui.theme.Gray
import com.pixel.restarttechnologyassignment.ui.theme.HeaderTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.LightTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.TextTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.Turquoise

@Composable
fun QuestionsScreen(modifier: Modifier = Modifier) {
    val tabsList =
        listOf(
            TabItem(
                name = "Writing",
                icon = Icons.Outlined.Edit,
            ),
            TabItem(
                name = "Oral",
                icon = MyIconPack.Mic,
            ),
        )
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val pagerState =
        rememberPagerState {
            tabsList.size
        }
    LaunchedEffect(selectedTabIndex) {
        pagerState.animateScrollToPage(selectedTabIndex)
    }
    LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {
        if (!pagerState.isScrollInProgress) {
            selectedTabIndex = pagerState.currentPage
        }
    }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier =
            modifier
                .padding(16.dp)
                .fillMaxSize(),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Questions",
                style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold),
                color = HeaderTurquoise,
            )

            if (selectedTabIndex == 0) {
                SortMenu(
                    itemsList = listOf("Categories"),
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Transparent,
            contentColor = Color.Transparent,
        ) {
            tabsList.forEachIndexed { index, tabItem ->
                Tab(
                    modifier =
                        Modifier
                            .wrapContentWidth(),
                    // Only take the necessary width for the tabs
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    selectedContentColor = Turquoise,
                    unselectedContentColor = Gray,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        modifier = Modifier.padding(vertical = 16.dp),
                    ) {
                        Icon(imageVector = tabItem.icon, contentDescription = tabItem.name)
                        Text(text = tabItem.name)
                    }
                }
            }
        }

        HorizontalPager(
            state = pagerState,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .weight(1f),
        ) {
            when (selectedTabIndex) {
                0 -> {
                    WritingPage(
                        quizList =
                            listOf(
                                quiz,
                                quiz,
                                quiz,
                                quiz,
                            ),
                    )
                }

                1 -> {
                    OralPage(
                        oralList =
                            listOf(
                                oral,
                                oral,
                                oral,
                                oral,
                            ),
                    )
                }
            }
        }
    }
}

@Composable
fun SortMenu(itemsList: List<String>) {
    var expended by remember { mutableStateOf(false) }
    var selectedSort by remember { mutableStateOf(itemsList[0]) }

    FilledTonalButton(
        onClick = { expended = !expended },
        colors = ButtonDefaults.filledTonalButtonColors(containerColor = LightTurquoise),
        shape = MaterialTheme.shapes.small,
    ) {
        Text(
            text = "View As: $selectedSort",
            color = TextTurquoise,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodySmall,
        )
        Icon(
            imageVector = if (expended) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
            contentDescription = "Sort",
        )
    }

    DropdownMenu(
        expanded = expended,
        onDismissRequest = { expended = false },
    ) {
        itemsList.forEach { item ->
            DropdownMenuItem(
                text = { Text(text = item) },
                onClick = {
                    selectedSort = item
                    expended = false
                },
            )
        }
    }
}

@Composable
fun WritingPage(
    quizList: List<Quiz>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
    ) {

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(quizList) { quiz ->
                ItemQuizCardView(
                    quiz = quiz,
                    onClick = { /* TODO: Handle item click */ }
                )
            }
        }
    }
}

@Composable
fun OralPage(
    oralList: List<Oral>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        FilledTonalButton(
            onClick = { /* Should open the filter dialog */ },
            colors = ButtonDefaults.filledTonalButtonColors(containerColor = LightTurquoise),
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.padding(6.dp),
        ) {
            Text(
                text = "Filter",
                color = TextTurquoise,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodySmall,
            )

            Spacer(modifier = Modifier.size(8.dp))

            Icon(
                painter = painterResource(R.drawable.ic_filter_list),
                contentDescription = "Filter partners",
                tint = Turquoise,
            )
        }

        LazyColumn {
            items(oralList) { oral ->
                ItemOralCard(
                    oral = oral,
                    onClick = { /* TODO: Handle item click */ },
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuestionsScreenPrev() {
    QuestionsScreen()
}

@Preview
@Composable
private fun SortMenuPrev() {
    SortMenu(itemsList = listOf("Categories"))
}
