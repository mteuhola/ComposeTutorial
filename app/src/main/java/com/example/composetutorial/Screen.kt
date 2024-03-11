package com.example.composetutorial
open class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object SearchScreen : Screen("search_screen")
    object NewPostScreen : Screen("newPost_screen")
    object CameraScreen : Screen("camera_screen")
    object ShoppingListScreen : Screen("shoppingList_screen")
    object ProfileScreen : Screen("profile_screen")
    object SettingsScreen : Screen("settings_screen")

}