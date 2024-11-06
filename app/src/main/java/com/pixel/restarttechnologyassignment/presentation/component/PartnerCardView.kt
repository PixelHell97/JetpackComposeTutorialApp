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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pixel.restarttechnologyassignment.presentation.models.Partner
import com.pixel.restarttechnologyassignment.ui.generatedIcons.MyIconPack
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.`Birthday-cake`
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Calendar
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Female
import com.pixel.restarttechnologyassignment.ui.generatedIcons.myiconpack.Male
import com.pixel.restarttechnologyassignment.ui.theme.LightTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.TextTurquoise
import com.pixel.restarttechnologyassignment.ui.theme.Turquoise
import com.pixel.restarttechnologyassignment.ui.theme.myFontFamily

@Composable
fun PartnerCardView(
    partner: Partner,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(16.dp),
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
                    .padding(16.dp),
        ) {
            // Header Row: Profile Icon and Name
            Row(verticalAlignment = Alignment.CenterVertically) {
                ProfileIcon(partner.name)

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = partner.name,
                            fontFamily = myFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = TextTurquoise,
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(
                            text = "Targeting: ${partner.targetingLevel}",
                            fontFamily = myFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = LightTurquoise,
                            modifier =
                                Modifier
                                    .background(Turquoise, shape = RoundedCornerShape(3.dp))
                                    .padding(2.dp),
                        )
                    }

                    // Last Seen
                    Text(
                        text = "Last seen online: ${partner.lastSeen}",
                        fontFamily = myFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color.Gray,
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    // Languages Row
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        partner.languages.forEach { language ->
                            LanguageChip(language)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Additional Information Row
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                InfoWithIcon(Icons.Outlined.LocationOn, partner.location)
                InfoWithIcon(
                    if (partner.gender == "Female") MyIconPack.Female else MyIconPack.Male,
                    partner.gender,
                )
                InfoWithIcon(MyIconPack.`Birthday-cake`, partner.age.toString())
                InfoWithIcon(MyIconPack.Calendar, partner.joinDate)
            }
        }
    }
}

@Composable
fun ProfileIcon(
    name: String,
    profilePicture: ImageVector? = null,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier =
            Modifier
                .size(48.dp)
                .background(Color(0xFF00796B), shape = CircleShape),
    ) {
        if (profilePicture == null) {
            Text(
                text = name.split(" ").joinToString("") { it.first().toString() },
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = Color.White,
            )
        } else {
            Icon(
                imageVector = profilePicture,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(24.dp),
            )
        }
    }
}

@Composable
fun LanguageChip(language: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier =
            Modifier
                .background(LightTurquoise, shape = RoundedCornerShape(6.dp))
                .padding(horizontal = 8.dp, vertical = 4.dp),
    ) {
        Text(
            text = language,
            style = MaterialTheme.typography.bodyMedium,
            fontFamily = myFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            color = TextTurquoise,
        )
    }
}

@Composable
fun InfoWithIcon(
    icon: ImageVector,
    info: String,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = Color.Gray,
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = info,
            fontFamily = myFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            color = Color.Gray,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PartnerPrev() {
    PartnerCardView(
        partner = partner,
        onClick = {},
    )
}

internal val partner =
    Partner(
        name = "Reem Sayed",
        targetingLevel = "B1",
        lastSeen = "Yesterday",
        languages = listOf("English", "Arabic", "French"),
        location = "Egypt",
        gender = "Female",
        age = 26,
        joinDate = "21 June 2023",
    )
