package com.furkaies.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.furkaies.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@Composable
fun MainView(modifier: Modifier = Modifier){

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(214, 231, 213)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NameCardView()
    }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InfoCardView()
    }
}

@Composable
fun NameCardView(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = modifier
                .background(Color.Black)
                .width(100.dp),
            painter = image,
            contentDescription = null,
        )
        Text(
            text = "Switch Mu",
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun InfoCardView(modifier: Modifier = Modifier){
    Column {
        Row(
            modifier = modifier.padding(10.dp)
        ) {
            Icon(Icons.Rounded.Phone, contentDescription = null)
            Text(
                modifier = modifier.padding(start = 20.dp),
                text = "000-000000"
            )
        }
        Row(
            modifier = modifier.padding(10.dp)
        ) {
            Icon(Icons.Rounded.Share, contentDescription = null)
            Text(
                modifier = modifier.padding(start = 20.dp),
                text = "@furies"
            )
        }
        Row(
            modifier = modifier.padding(10.dp)
        ) {
            Icon(Icons.Rounded.Email, contentDescription = null)
            Text(
                modifier = modifier.padding(start = 20.dp),
                text = "xxx@xx.com"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NameCardTheme {
        MainView()
    }
}