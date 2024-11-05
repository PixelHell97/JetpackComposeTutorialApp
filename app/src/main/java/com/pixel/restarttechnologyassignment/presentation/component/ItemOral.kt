package com.pixel.restarttechnologyassignment.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pixel.restarttechnologyassignment.presentation.models.Oral
import com.pixel.restarttechnologyassignment.ui.generatedIcons.MyIconPack
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Page

@Composable
fun ItemOralCard(
    oral: Oral,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier =
            modifier
                .fillMaxWidth()
                .padding(8.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        onClick = onClick,
        colors = CardDefaults.cardColors(containerColor = Color.White),
    ) {
        Column(
            modifier =
                Modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 6.dp),
        ) {
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.fillMaxWidth(),
            ) {
                // Tags Row
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    TagChip(oral.category)
                    TagChip(oral.taskName)
                }

                IconButton(
                    onClick = { /* Expand the menu */ },
                    modifier = Modifier.align(Alignment.CenterEnd),
                ) {
                    Icon(Icons.Default.MoreVert, contentDescription = "Localized description")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /* Dismiss The Menu */ }) {
                    // Menu Items
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Question Text
            Text(
                text = "• ${oral.question}",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Black,
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Bottom Row: Answers Count and Date
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = MyIconPack.Page,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = Color.Gray,
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "${oral.answersCount} answers",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Gray,
                    )
                }
                Text(
                    text = oral.date,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray,
                )
            }
        }
    }
}

@Composable
fun TagChip(tag: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier =
            Modifier
                .background(Color(0xFFEEEEEE), shape = RoundedCornerShape(6.dp))
                .padding(horizontal = 8.dp, vertical = 4.dp),
    ) {
        Text(
            text = tag,
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF757575),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OralCardPrev() {
    ItemOralCard(
        oral = oral,
        onClick = {},
    )
}

internal val oral =
    Oral(
        category = "Technology",
        taskName = "Task 3",
        question = "Quand quelqu'un quitte son pays pour aller vivre ailleurs, c'est souvent parce qu'il n'a pas d'autre choix. Qu'en pensez-vous ?",
        answersCount = 11,
        date = "13 May 2023",
    )
