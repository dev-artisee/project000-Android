package com.dev.artisee.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.dev.artisee.navigation.TopLevelDestination
import com.dev.bookmark.navigateToBookmark
import com.dev.home.homeNavigationRoute
import com.dev.home.navigateToHome
import com.dev.my.navigateToMy
import com.dev.random.navigateToRandom
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberArtiseeAppState(
    windowSizeClass: WindowSizeClass,
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    navController: NavHostController = rememberNavController(),
): ArtiseeAppState {
    return remember(
        navController,
        coroutineScope,
        windowSizeClass
    ) {
        ArtiseeAppState(
            navController,
            coroutineScope,
            windowSizeClass
        )
    }
}
@Stable
class ArtiseeAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope,
    val windowSizeClass: WindowSizeClass,
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            homeNavigationRoute -> TopLevelDestination.HOME
            else -> null
        }

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelNavOptions = navOptions {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }

        when (topLevelDestination) {
            TopLevelDestination.HOME -> navController.navigateToHome()
            TopLevelDestination.BOOKMARK -> navController.navigateToBookmark()
            TopLevelDestination.RANDOM -> navController.navigateToRandom()
            TopLevelDestination.MY -> navController.navigateToMy()
        }
    }
}
