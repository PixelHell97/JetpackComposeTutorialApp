package com.pixel.jetpackcomposetutorialapp.presentation.screens

import androidx.compose.foundation.background
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
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.pixel.jetpackcomposetutorialapp.R
import com.pixel.jetpackcomposetutorialapp.presentation.component.CustomIndicator
import com.pixel.jetpackcomposetutorialapp.presentation.component.OralCardView
import com.pixel.jetpackcomposetutorialapp.presentation.component.QuizCardView
import com.pixel.jetpackcomposetutorialapp.presentation.component.oral
import com.pixel.jetpackcomposetutorialapp.presentation.component.quiz
import com.pixel.jetpackcomposetutorialapp.presentation.models.Oral
import com.pixel.jetpackcomposetutorialapp.presentation.models.Quiz
import com.pixel.jetpackcomposetutorialapp.presentation.models.TabItem
import com.pixel.jetpackcomposetutorialapp.ui.generatedIcons.MyIconPack
import com.pixel.jetpackcomposetutorialapp.ui.generatedIcons.myiconpack.Mic
import com.pixel.jetpackcomposetutorialapp.ui.theme.Gray
import com.pixel.jetpackcomposetutorialapp.ui.theme.HeaderTurquoise
import com.pixel.jetpackcomposetutorialapp.ui.theme.LightTurquoise
import com.pixel.jetpackcomposetutorialapp.ui.theme.TextTurquoise
import com.pixel.jetpackcomposetutorialapp.ui.theme.Turquoise
import com.pixel.jetpackcomposetutorialapp.ui.theme.myFontFamily
import kotlinx.coroutines.launch

@Composable
fun QuestionsScreen(
    modifier: Modifier = Modifier,
    tutorialModifier: Modifier = Modifier,
) {
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
    val scope = rememberCoroutineScope()
    val pagerState =
        rememberPagerState(pageCount = { tabsList.size })
    val selectedTabIndex by remember { derivedStateOf { pagerState.currentPage } }

    Column(
        horizontalAlignment = Alignment.Start,
        modifier =
            modifier
                .padding(16.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Questions",
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = HeaderTurquoise,
            )

            if (selectedTabIndex == 0) {
                SortMenu(
                    itemsList = listOf("Categories"),
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Transparent,
            contentColor = Color.Transparent,
            divider = {},
            edgePadding = 0.dp,
            indicator = { tabPositions ->
                if (selectedTabIndex < tabPositions.size) {
                    SecondaryIndicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        color = Turquoise,
                    )
                }
            },
        ) {
            tabsList.forEachIndexed { index, tabItem ->
                Tab(
                    modifier =
                        Modifier
                            .wrapContentWidth()
                            .padding(horizontal = 26.dp),
                    selected = selectedTabIndex == index,
                    onClick = {
                        scope.launch { pagerState.animateScrollToPage(index) }
                    },
                    selectedContentColor = Turquoise,
                    unselectedContentColor = Gray,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(vertical = 16.dp),
                    ) {
                        Icon(imageVector = tabItem.icon, contentDescription = tabItem.name)
                        Text(
                            text = tabItem.name,
                            fontFamily = myFontFamily,
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        HorizontalPager(
            state = pagerState,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .weight(1f),
        ) { page ->
            when (page) {
                0 -> {
                    WritingPage(
                        quizList =
                            listOf(
                                Quiz(
                                    questionsCompleted = 6,
                                    totalQuestions = 10,
                                    category = "Writings",
                                    progressPercentage = 72,
                                    R.drawable.ic_design_nib,
                                ),
                                quiz,
                                quiz,
                                quiz,
                                quiz,
                            ),
                        tutorialModifier = tutorialModifier,
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
            fontSize = 10.sp,
            fontFamily = myFontFamily,
            fontWeight = FontWeight.Medium,
        )
        Icon(
            imageVector = if (expended) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
            contentDescription = "Sort",
        )

        DropdownMenu(
            expanded = expended,
            onDismissRequest = { expended = false },
            modifier =
                Modifier
                    .wrapContentWidth()
                    .background(Color.White),
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
}

@Composable
fun WritingPage(
    quizList: List<Quiz>,
    modifier: Modifier = Modifier,
    tutorialModifier: Modifier = Modifier,
) {
    var selectedTaskTabIndex by remember { mutableIntStateOf(0) }
    val tasks =
        listOf(
            "Task 1",
            "Task 2",
            "Task 3",
        )
    val indicator = @Composable { tabPositions: List<TabPosition> ->
        CustomIndicator(tabPositions, selectedTaskTabIndex)
    }
    Column(
        modifier = modifier.fillMaxSize(),
    ) {
        ScrollableTabRow(
            selectedTabIndex = selectedTaskTabIndex,
            indicator = indicator,
            divider = {},
            edgePadding = 0.dp,
            containerColor = Color.Transparent,
            contentColor = Color.Transparent,
        ) {
            tasks.forEachIndexed { index, task ->
                Tab(
                    modifier = Modifier.zIndex(2f),
                    text = {
                        Text(
                            text = task,
                            color = if (selectedTaskTabIndex == index) Color.White else Color.Black,
                        )
                    },
                    selected = selectedTaskTabIndex == index,
                    onClick = {
                        selectedTaskTabIndex = index
                        // TODO: Update the task list with the selected task group
                    },
                )
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(quizList) { quiz ->
                QuizCardView(
                    quiz = quiz,
                    onClick = { /* TODO: Handle item click */ },
                    modifier =
                        if (quiz == quizList.first()) {
                            tutorialModifier
                        } else {
                            Modifier
                        },
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
        modifier = modifier.fillMaxSize(),
    ) {
        FilledTonalButton(
            onClick = { /* Should open the filter dialog */ },
            colors = ButtonDefaults.filledTonalButtonColors(containerColor = LightTurquoise),
            shape = MaterialTheme.shapes.small,
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
                OralCardView(
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
    // QuestionsScreen()
}

@Preview
@Composable
private fun SortMenuPrev() {
    SortMenu(itemsList = listOf("Categories"))
}
