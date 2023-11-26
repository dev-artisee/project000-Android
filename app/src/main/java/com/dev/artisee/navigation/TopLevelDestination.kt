package com.dev.artisee.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.dev.artisee.R
import com.dev.designsystem.icon.ArtiseeIcons

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    HOME(
        selectedIcon = ArtiseeIcons.Home,
        unselectedIcon = ArtiseeIcons.Home,
        iconTextId = R.string.home,
        titleTextId = R.string.app_name,
    ),
    BOOKMARK(
        selectedIcon = ArtiseeIcons.Star,
        unselectedIcon = ArtiseeIcons.Star,
        iconTextId = R.string.bookmark,
        titleTextId = R.string.app_name,
    ),
    RANDOM(
        selectedIcon = ArtiseeIcons.Favorite,
        unselectedIcon = ArtiseeIcons.Favorite,
        iconTextId = R.string.random,
        titleTextId = R.string.app_name
    ),
    MY(
        selectedIcon = ArtiseeIcons.Person,
        unselectedIcon = ArtiseeIcons.Person,
        iconTextId = R.string.my,
        titleTextId = R.string.app_name
    )
}
