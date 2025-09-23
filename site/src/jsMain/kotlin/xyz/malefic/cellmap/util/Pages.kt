package xyz.malefic.cellmap.util

enum class Pages(
    val value: String,
    val route: String,
) {
    INDEX("Cell Explorer", "/"),
    ABOUT("About", "/about"),
    ORGANELLE_DETAIL("Organelle Detail", "/organelle"),
}
