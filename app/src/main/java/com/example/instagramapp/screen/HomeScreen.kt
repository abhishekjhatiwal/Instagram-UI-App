package com.example.instagramapp.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.instagramapp.R
import com.example.instagramapp.data.Post
import com.example.instagramapp.data.Story


@Composable
fun InstagramHomeScreenUI(modifier : Modifier = Modifier) {
    val logoFont = FontFamily(Font(resId = R.font.pacifico_pegular))

    val stories = listOf(
        Story("Your story", R.drawable.audi, true),
        Story("google", R.drawable.marsadi),
        Story("microsoft", R.drawable.car3),
        Story("infosys", R.drawable.car4),
        Story("tcs", R.drawable.car1)
    )

    val posts = listOf(
        Post(
            postUsername = "abhishek_jhatiwal",
            postProfileImage = R.drawable.audi,
            postPhoto = R.drawable.car2,
            postCaption = "My Car Collection",
            postHours = "2hr ago",
            postLikes = "100 likes"
        ),
        Post(
            postUsername = "google",
            postProfileImage = R.drawable.audi,
            postPhoto = R.drawable.car6,
            postCaption = "AI Mode ON",
            postHours = "5hrs ago",
            postLikes = "108k likes"
        )
    )
    MaterialTheme {
        Scaffold(
            topBar = { TopAppBarInstagram(logoFont) },
            bottomBar = { BottomNavInstagram() },
            containerColor = Color(0xFF0F0F0F)
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                item { Spacer(modifier = Modifier.height(8.dp)) }
                item { StoriesRow(stories = stories) }
                item { Spacer(modifier = Modifier.height(8.dp)) }
                item { PostImageCard(posts[0]) }
                items(posts.drop(1)) { post ->
                    Spacer(modifier = Modifier.height(8.dp))
                    PostImageCard(post)
                }
                item { Spacer(modifier = Modifier.height(90.dp)) }
            }
        }
    }
}