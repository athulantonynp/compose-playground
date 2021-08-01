package app.athul.composibles.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import app.athul.composibles.R
import app.athul.composibles.ui.theme.ComposiblesTheme
import app.athul.composibles.ui.widgets.FixedHeightBar
import app.athul.composibles.utils.Utils

class MainActivity : ComponentActivity() {
    @ExperimentalUnitApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposiblesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White,
                modifier = Modifier.fillMaxHeight()) {
                    Greeting()
                }
            }
        }
    }

    @ExperimentalUnitApi
    @Composable
    fun Greeting() {

        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()){
                Text(text = "Status",fontSize = TextUnit(42f, TextUnitType.Sp),fontWeight = FontWeight(700),
                    modifier = Modifier.alignByBaseline())
                Icon(painter = painterResource(id = R.drawable.ic_baseline_sync_24), contentDescription = "Sync icon")
            }
            ChartCard()
            Button(onClick = { launchCanvasActivity()},modifier = Modifier.padding(top = 24.dp)) {
                Text(text = "Launch Canvas")
            }
        }
    }

    private fun launchCanvasActivity(){
        startActivity(Intent(this,CanvasActivity::class.java))
    }
}



@ExperimentalUnitApi
@Composable
fun ChartCard(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        Utils.getColor("#0f0c29"),
                        Utils.getColor("#302b63"),
                        Utils.getColor("#24243e")
                    )
                ),
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { },
    ){
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(text="Result",color=Color.White,fontSize = TextUnit(24f,TextUnitType.Sp))

            Row(horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)) {
                FixedHeightBar(height = 80.dp)
                FixedHeightBar(height = 40.dp)
                FixedHeightBar(height = 120.dp)
                FixedHeightBar(height = 140.dp)
                FixedHeightBar(height = 100.dp)
                FixedHeightBar(height = 90.dp)
                FixedHeightBar(height = 160.dp)
            }
        }
    }
}
