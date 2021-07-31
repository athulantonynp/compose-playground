package app.athul.composibles.utils

import androidx.compose.ui.graphics.Color

object Utils {
    fun getColor(colorString: String): Color {
        return Color(android.graphics.Color.parseColor(colorString))
    }
}