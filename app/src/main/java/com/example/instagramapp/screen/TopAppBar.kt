package com.example.instagramapp.screen

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
                    painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                    contentDescription = "Notification",
                    modifier = Modifier.size(22.dp)
                )
            }

            //Message
            Box(modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.TopEnd){
                IconButton(onClick = {}) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_chat_bubble_outline_24),
                        contentDescription = "Message",
                        modifier = Modifier.size(22.dp)
                    )
                }
                //Red Badge Message
                Box(
                    modifier = Modifier.size(18.dp)
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
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp)
    )
}