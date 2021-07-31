package app.athul.composibles.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import app.athul.composibles.utils.Utils

@Composable
fun FixedHeightBar(height:Dp,width:Dp){ Box(modifier = Modifier
        .background( Brush.verticalGradient(
            colors = listOf(
                Utils.getColor("#fc4a1a"),
                Utils.getColor("#f7b733")
            )
        ),
            shape = RoundedCornerShape(48.dp)
        )
        .height(height = height)
        .width(width = width)){

    }
}