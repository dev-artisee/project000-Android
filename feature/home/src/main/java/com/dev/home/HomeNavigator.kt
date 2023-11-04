package com.dev.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

private const val ID = "test"
const val homeNavigationRoute = "home_route"
const val DEEP_LINK_URI_PATTERN = ""
fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(homeNavigationRoute, navOptions)
}

fun NavGraphBuilder.homeScreen() {
    composable(
        route = homeNavigationRoute,
    ) {
        HomeRoute()
    }
}