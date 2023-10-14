package com.example.lightoff.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lightoff.R


@Composable
fun Main() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.burger),
                    contentDescription = "bico"
                )
            }


            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bell_badge),
                    contentDescription = "bico"
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.SpaceAround,
        ) {
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFB9ADD4)),
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .padding()
            ) {
                Text(
                    text = "Как сканировать QR-код?",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 10.dp),
                    fontSize = 15.sp
                )
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFB9ADD4)),
                modifier = Modifier.size(width = 100.dp, height = 100.dp)
            ) {
                Text(
                    text = "Как записаться на встречу?",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 10.dp),
                    fontSize = 15.sp
                )
            }
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFFB9ADD4)),
                modifier = Modifier.size(width = 100.dp, height = 100.dp)
            ) {
                Text(
                    text = "Как найти коллегу??",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 25.dp),
                    fontSize = 15.sp
                )
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(28.dp),
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color(0xFF8A76B4))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.magnify),
                    contentDescription = "search"
                )
            }
            Box(
                modifier = Modifier
                    .height(28.dp)
                    .clip(RoundedCornerShape(5.dp))
            ) {
                TextField(value = "Искать людей, места, услуги...", onValueChange = {}, modifier = Modifier.fillMaxSize())
            }

        }
    }

}