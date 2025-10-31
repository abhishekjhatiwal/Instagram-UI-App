package com.example.instagramapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarInstagram(logoFont: FontFamily) {
    TopAppBar(
        title = {
            Text(
                text = "Instagram",
                fontFamily = logoFont,
                fontSize = 32.sp,
                color = Color.White
            )
        },
        //Notification
        actions = {
            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(id = R.drawable.ic_favorite),
                    contentDescription = "Notification",
                    modifier = Modifier.size(22.dp)
                )
            }

            //Message
            Box(modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.TopEnd) {
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_chat_bob),
                        contentDescription = "Message",
                        modifier = Modifier.size(22.dp)
                    )
                }
                //Red Badge Message
                Box(
                    modifier = Modifier
                        .size(18.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFFF3B30)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "8",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.offset(y = (-3).dp)
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF0F0F0F)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp)
    )
}