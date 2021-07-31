package app.athul.composibles.ui.widgets

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun FixedHeightBar(height:Dp,width:Dp){
    androidx.compose.material.Surface(modifier = Modifier
        .height(height = height)
        .width(width = width)
        ,color = Color.Blue,
    shape = RoundedCornerShape(topStart = 16f,topEnd = 16f)){

    }
}