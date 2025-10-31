package com.example.instagramapp.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagramapp.R

@Composable
fun BottomNavInstagram(){
    NavigationBar(
        containerColor = Color(0xFF0F0F0F),
        tonalElevation = 8.dp,
        modifier = Modifier.fillMaxWidth().height(68.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {}) {
                Image(painter = painterResource(id = R.drawable.baseline_home_24), contentDescription = "Home", modifier = Modifier.size(26.dp))
            }
            IconButton(onClick = {}) {
                Image(painter = painterResource(id = R.drawable.baseline_search_24), contentDescription = "Search", modifier = Modifier.size(26.dp))
            }
            IconButton(onClick = {}) {
                Image(painter = painterResource(id = R.drawable.outline_add_box_24), contentDescription = "Add", modifier = Modifier.size(26.dp))
            }
            IconButton(onClick = {}) {
                Image(painter = painterResource(id = R.drawable.outline_video_library_24), contentDescription = "Reels", modifier = Modifier.size(26.dp))
            }

            Box(
                modifier = Modifier.size(40.dp).clip(CircleShape)
                    .background(Color.Transparent).clickable{},
                contentAlignment = Alignment.Center
            ) {
                //Profile Tab Ring
                Canvas(modifier = Modifier.size(40.dp)) {
                    val stroke = with(this) {
                        3.dp.toPx()
                    }
                    drawCircle(
                        brush = Brush.sweepGradient(
                            listOf(Color(0xFFFFC107),
                                Color(0xFFDD2A7B),
                                Color(0xFF7A00C4),
                                Color(0xFFFFC107))
                        ), radius = size.minDimension / 2f,
                        style = Stroke(width = stroke)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.aklogo),
                    contentDescription = "Profile Tab",
                    modifier = Modifier.size(34.dp).clip(CircleShape)
                        .offset(x = 0.dp, y = 0.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}