package com.pixel.restarttechnologyassignment.presentation.component

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pixel.restarttechnologyassignment.presentation.models.BottomNavItem
import com.pixel.restarttechnologyassignment.ui.theme.Gray
import com.pixel.restarttechnologyassignment.ui.theme.RestartTechnologyAssignmentTheme
import com.pixel.restarttechnologyassignment.ui.theme.Turquoise

@Composable
fun BottomNavBar(navController: NavController) {
    val bottomNavItems =
        listOf(
            BottomNavItem.Home,
            BottomNavItem.Connect,
            BottomNavItem.Questions,
            BottomNavItem.Tools,
            BottomNavItem.Profile,
        )

    NavigationBar(
        containerColor = Color.White,
    ) {
        bottomNavItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.label,
                    )
                },
                label = { Text(text = item.label, style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp)) },
                selected =
                    navController
                        .currentBackStackEntryAsState()
                        .value
                        ?.destination
                        ?.route == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors =
                    NavigationBarItemColors(
                        selectedIconColor = Turquoise,
                        selectedTextColor = Turquoise,
                        unselectedIconColor = Gray,
                        unselectedTextColor = Gray,
                        disabledIconColor = Gray,
                        disabledTextColor = Gray,
                        selectedIndicatorColor = Color.Transparent,
                    ),
                // modifier = Modifier.highlightor(index = 0, description = "Hello"),
            )
        }
    }
}

@Preview
@Composable
private fun BottomNavPrev() {
    RestartTechnologyAssignmentTheme {
        BottomNavBar(navController = NavController(LocalContext.current))
    }
}
