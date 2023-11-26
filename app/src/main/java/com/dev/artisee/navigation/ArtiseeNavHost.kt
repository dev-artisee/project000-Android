package com.dev.artisee.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.dev.bookmark.bookmarkScreen
import com.dev.my.myScreen
import com.dev.random.randomScreen
import com.dev.home.homeScreen
import com.dev.artisee.ui.ArtiseeAppState
import com.dev.home.homeNavigationRoute

@Composable
fun ArtiseeNavHost(appState: ArtiseeAppState) {
    val navController = appState.navController
    Column(Modifier.fillMaxSize()) {
        // TODO Show the top app bar on top level destinations.
        NavHost(
            navController = navController,
            startDestination = homeNavigationRoute
        ) {
            homeScreen()
            bookmarkScreen()
            randomScreen()
            myScreen()
        }
    }
}
