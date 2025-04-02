pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Tasherokk/AndroidWebSocketChatLibrary")
            credentials {
                username = "Tasherokk"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}


rootProject.name = "AndroidChatApp"
include(":app")
 