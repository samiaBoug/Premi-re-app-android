package com.example.projet_cartedevisite

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet_cartedevisite.ui.theme.ProjetCarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetCarteDeVisiteTheme {

                    CarteVisite(
                        name = stringResource(R.string.name),
                        title = stringResource(R.string.title) ,
                        history = stringResource(R.string.description) ,

                    )

            }
        }
    }
}

@Composable
fun CarteVisite(name: String,title : String , history : String ,modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.huileolive)
    Box{
        val backgrounImg = painterResource(R.drawable.pexels_eberhardgross_2086351)
        Image (
            painter = backgrounImg ,
            contentDescription = null ,
            alpha = 0.5f ,
            contentScale = ContentScale.Crop

        )
    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(9.dp)
           ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){


            Box(modifier = modifier.border(2.dp , Color(0xFF5D7052))) {
                Image(
                    painter = image,
                    contentDescription = null ,
                    modifier = modifier.shadow(9.dp, shape = RoundedCornerShape(8.dp))
                )
            }

            Text(
                text = name,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 18.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = title,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(8.dp)

            )

            Text(
                text = history,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp),

                )


        }





}
}

@Preview(showBackground = true)
@Composable
fun CarteVisitePreview() {
    ProjetCarteDeVisiteTheme {
        CarteVisite(
            name = stringResource(R.string.name),
            title = stringResource(R.string.title) ,
            history = stringResource(R.string.description) ,

        )
    }
}