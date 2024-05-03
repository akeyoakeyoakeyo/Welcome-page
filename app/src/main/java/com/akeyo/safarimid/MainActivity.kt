package com.akeyo.safarimid


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akeyo.safarimid.ui.theme.SafarimidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafarimidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
             modifier = Modifier
                 .fillMaxSize()
                 .background(Color.Cyan)) {

        Text(text = "Akeyo's Mobile App",
                    color = Color.Black,
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Welcome!",
                    color = Color.Black ,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Stay tuned",
                    color = Color.Black,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif
        )
        Image(painter = painterResource(id = R.drawable.mine) , contentDescription ="chocolates" )

    }
}

@Preview
@Composable
private fun HomePrev() {
    Home()
}