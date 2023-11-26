package com.dev.my

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

private const val ID = "test"
const val myNavigationRoute = "my_route"
fun NavController.navigateToMy(navOptions: NavOptions? = null) {
    this.navigate(com.dev.my.myNavigationRoute, navOptions)
}

fun NavGraphBuilder.myScreen() {
    composable(
        route = com.dev.my.myNavigationRoute,
    ) {
        MyRoute()
    }
}