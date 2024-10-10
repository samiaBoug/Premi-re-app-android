package com.example.exercices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercices.ui.theme.ExercicesTheme

class GestionnaireTaches : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GestionnaireTaches(
                                    composable1 = stringResource(R.string.composable1) ,
                                    composable2 = stringResource(R.string.composable2)

                    )
                }
            }
        }
    }
}

@Composable
fun GestionnaireTaches(composable1 :String , composable2 :String , modifier : Modifier = Modifier) {
   val image = painterResource(R.drawable.ic_task_completed)

    Column (
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement  = Arrangement.Center ,
            modifier = Modifier.fillMaxSize()
        ){
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = composable1 ,
            fontWeight = FontWeight.Bold ,
            modifier = Modifier.padding(top = 24.dp , bottom = 8.dp )
        )
        Text(
            text = composable2,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GestionnaireTachesPreview() {
    ExercicesTheme {
        GestionnaireTaches(
            composable1 = stringResource(R.string.composable1) ,
            composable2 = stringResource(R.string.composable2)
        )
    }
}