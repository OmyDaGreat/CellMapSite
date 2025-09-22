package xyz.malefic.staticsite.util

enum class Pages(
    val value: String,
    val route: String,
) {
    INDEX("Cell Explorer", "/"),
    ABOUT("About", "/about"),
}
