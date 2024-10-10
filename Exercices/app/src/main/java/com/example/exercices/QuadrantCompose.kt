package com.example.exercices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exercices.ui.theme.ExercicesTheme

class QuadrantCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuadrantCompose(

                    )
                }
            }
        }
    }
}


@Composable

fun QuadrantCompose(titre1 : String , contenue1 : String , titre2 : String , contenue2 : String , titre3 : String , contenue3 : String , titre4 : String , contenue4 : String , modifier: Modifier = Modifier) {

    Column(modifier = Modifier) {
        Row {
            Column {
                Text(
                    text = titre1
                )
                Text(
                    text = contenue1
                )
            }

            Column {
                Text(
                    text = titre2
                )
                Text(
                    text = contenue2
                )
            }
        }

        Row {
            Column {
                Text(
                    text = titre3
                )
                Text(
                    text = contenue3
                )
            }

            Column {
                Text(
                    text = titre4
                )
                Text(
                    text = contenue4
                )
            }
        }
    }


  }

@Preview(showBackground = true)
@Composable
fun QuadrantComposePreview() {
    ExercicesTheme {
        QuadrantCompose (
            titre1 = "Text composable",
            titre2 = "Image composable",
            titre3 = "Row composable",
            titre4 = "Column composable",
            contenue1 = "Displays text and follows the recommended Material Design guidelines." ,
            contenue2 = "Creates a composable that lays out and draws a given Painter class object." ,
            contenue3 = "A layout composable that places its children in a horizontal sequence." ,
            contenue4 = "A layout composable that places its children in a vertical sequence."
        )




    }
}
