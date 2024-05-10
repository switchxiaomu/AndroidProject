package com.furkaies.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.furkaies.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantView()
                }
            }
        }
    }
}

@Composable
fun QuadrantView(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            modifier = modifier.weight(1f)
        ) {
            ComposableInfoCard(
                color = Color(0xFFEADDFF),
                title = "Text composable",
                content = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                color = Color(0xFFD0BCFF),
                title = "Image composable",
                content = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = modifier.weight(1f)
        ){
            ComposableInfoCard(
                color = Color(0xFFB69DF8),
                title = "Row composable",
                content = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                color = Color(0xFFF6EDFF),
                title = "Column composable",
                content = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposableInfoCard(color: Color, title: String, content: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "$title",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "$content",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        QuadrantView()
    }
}