package com.example.instagramapp.data

data class Story(
    val storyUsername: String,
    val storyProfileImage: Int,
    val isYourStory: Boolean = false
)

data class Post(
    val postUsername: String,
    val postProfileImage: Int,
    val postPhoto: Int,
    val postCaption: String,
    val postHours: String,
    val postLikes: String
)
