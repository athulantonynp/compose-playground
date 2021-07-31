package app.athul.composibles.utils

import androidx.compose.ui.graphics.Color

fun Color.parse(colorString: String): Color {
    return Color(android.graphics.Color.parseColor("#" + colorString))
}