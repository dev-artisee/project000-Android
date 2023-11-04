package com.dev.bookmark

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

private const val ID = "test"
const val bookmarkNavigationRoute = "bookmark_route"
fun NavController.navigateToBookmark(navOptions: NavOptions? = null) {
    this.navigate(bookmarkNavigationRoute, navOptions)
}

fun NavGraphBuilder.bookmarkScreen() {
    composable(
        route = bookmarkNavigationRoute,
    ) {
        BookmarkRoute()
    }
}