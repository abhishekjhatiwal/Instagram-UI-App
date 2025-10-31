package com.example.instagramapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramapp.R
import com.example.instagramapp.data.Post

@Composable
fun PostImageCard(post: Post) {
    Card(
        colors = CardDefaults.cardColors(Color(0xFF121212)),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = post.postProfileImage),
                    contentDescription = "Profile Pic",
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.width(10.dp))

                //Verified
                Column(modifier = Modifier.weight(1f)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = post.postUsername, color = Color.White,
                            fontWeight = FontWeight.Bold, fontSize = 14.sp
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Image(
                            painter = painterResource(id = R.drawable.ic_verified),
                            contentDescription = "verified",
                            modifier = Modifier.size(14.dp)
                        )
                    }
                    Text(text = post.postHours, color = Color(0xFFB0B0B0), fontSize = 12.sp)
                }
                //Follow Button
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF2E2E2E)),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                    shape = RoundedCornerShape(30),
                    modifier = Modifier.height(36.dp)
                ) {
                    Text(text = "Follow", color = Color.White)
                }
                Spacer(modifier = Modifier.width(6.dp))

                //More Icon
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_more_vert),
                        contentDescription = "More",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            //Post Image
            Image(
                painter = painterResource(id = post.postPhoto),
                contentDescription = "Post Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(360.dp),
                contentScale = ContentScale.Crop
            )

            //Like, Comment, Share, Save
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {}) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_favorite),
                            contentDescription = "like",
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_comment),
                            contentDescription = "comment",
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_share),
                            contentDescription = "Share",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_bookmark),
                        contentDescription = "Save",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
            //Like Count, Caption, Comments
            Column(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = post.postLikes,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row {
                    Text(
                        text = post.postUsername + " ",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = post.postCaption,
                        color = Color(0xFFDADADA),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "View all comments",
                    color = Color(0xFF9E9E9E),
                    fontSize = 12.sp
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}