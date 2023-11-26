package com.dev.random

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

private const val ID = "test"
const val randomNavigationRoute = "random_route"
fun NavController.navigateToRandom(navOptions: NavOptions? = null) {
    this.navigate(com.dev.random.randomNavigationRoute, navOptions)
}

fun NavGraphBuilder.randomScreen() {
    composable(
        route = com.dev.random.randomNavigationRoute,
    ) {
        RandomRoute()
    }
}