pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Artisee"
include(":app")
include(":feature")
include(":core")
include(":core:designsystem")
include(":feature:home")
include(":feature:bookmark")
include(":feature:my")
include(":feature:random")
