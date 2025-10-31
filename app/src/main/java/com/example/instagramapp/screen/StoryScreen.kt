package com.example.instagramapp.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.data.Story

@Composable
fun StoriesRow(stories: List<Story>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(stories) { story ->
            //StoryItem
            StoryItem(story)
        }
    }
}

@Composable
fun StoryItem(story: Story) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        val storyOuterCircleSize = 72.dp
        val storyProfileImageSize = 60.dp
        Box(
            modifier = Modifier.size(storyOuterCircleSize),
            contentAlignment = Alignment.Center
        ) {
            //Story Gradient Ring
            Canvas(modifier = Modifier.size(storyOuterCircleSize)) {
                val stroke = 6f
                drawCircle(
                    brush = Brush.sweepGradient(
                        colors = listOf(
                            Color(0xFFFFC107),
                            Color(0xFFDD2A7B),
                            Color(0xFF7A00C4),
                            Color(0xFFFFC107)
                        )
                    ),
                    radius = size.minDimension / 2f,
                    style = Stroke(width = stroke)
                )
            }
            Image(
                painter = painterResource(id = story.storyProfileImage),
                contentDescription = story.storyUsername,
                modifier = Modifier.size(storyProfileImageSize)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            if (story.isYourStory) {
                Box(
                    modifier = Modifier.size(22.dp)
                        .align(Alignment.BottomEnd)
                        .offset(x = 2.dp, y = 2.dp)
                        .clip(CircleShape)
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text("+", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = story.storyUsername,
            color = Color(0xFFDADADA),
            fontSize = 12.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}