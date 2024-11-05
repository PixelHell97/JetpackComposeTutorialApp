package com.pixel.restarttechnologyassignment.presentation.component

import androidx.compose.foundation.background
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pixel.restarttechnologyassignment.R
import com.pixel.restarttechnologyassignment.presentation.models.Quiz
import com.pixel.restarttechnologyassignment.ui.theme.LightTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.TextTurquoise

@Composable
fun ItemQuizCardView(
    quiz: Quiz,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier =
            modifier,
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        onClick = onClick,
    ) {
        Column(
            modifier =
                Modifier
                    .padding(16.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            // Questions Progress
            Box(
                contentAlignment = Alignment.Center,
                modifier =
                    Modifier
                        .background(LightTurquoise, shape = RoundedCornerShape(6.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp),
            ) {
                Text(
                    text = "${quiz.questionsCompleted} sur ${quiz.totalQuestions} Questions",
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextTurquoise,
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Category Icon and Name
                Icon(
                    painter = painterResource(id = quiz.icon), // Replace with the actual icon resource
                    contentDescription = null,
                    modifier = Modifier.size(32.dp),
                    tint = Color.Gray,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = quiz.category,
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color(0xFF6B7280),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Progress Text
            Text(
                text = "Progress ${quiz.progressPercentage}%",
                style = MaterialTheme.typography.bodySmall,
                color = Color(0xFF6B7280),
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Progress Bar
            LinearProgressIndicator(
                progress = { quiz.progressPercentage / 100f },
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(100)),
                color = Color(0xFF00796B),
                trackColor = Color(0xFFE0E0E0),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuizCardPrev() {
    ItemQuizCardView(
        quiz = quiz,
        onClick = {},
    )
}

internal val quiz =
    Quiz(
        questionsCompleted = 5,
        totalQuestions = 10,
        category = "Environment",
        progressPercentage = 50,
        R.drawable.ic_environment,
    )
