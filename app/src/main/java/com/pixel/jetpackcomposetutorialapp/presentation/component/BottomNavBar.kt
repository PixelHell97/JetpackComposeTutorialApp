package com.pixel.jetpackcomposetutorialapp.presentation.component

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pixel.jetpackcomposetutorialapp.presentation.models.BottomNavItem
import com.pixel.jetpackcomposetutorialapp.ui.theme.Gray
import com.pixel.jetpackcomposetutorialapp.ui.theme.RestartTechnologyAssignmentTheme
import com.pixel.jetpackcomposetutorialapp.ui.theme.Turquoise

@Composable
fun BottomNavBar(
    navController: NavController,
    modifier: (
        index: Int,
        nextStep: () -> Unit,
    ) -> Modifier,
) {
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
                label = {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                    )
                },
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
                modifier =
                    if (index in 0..2) {
                        val counter = if (index == 2) 2 else index + 1
                        modifier(
                            index,
                        ) {
                            navController.navigate(bottomNavItems[counter].route)
                        }
                    } else {
                        Modifier
                    },
            )
        }
    }
}

@Preview
@Composable
private fun BottomNavPrev() {
    RestartTechnologyAssignmentTheme {
        // BottomNavBar(navController = NavController(LocalContext.current))
    }
}
