package com.example.instagramapp.data

data class Story(
    val storyUserName: String,
    val storyProfileImage: Int,
    val isYourStory: Boolean
)

data class post(
    val postUserName: String,
    val postProfileImage: Int,
    val postPhoto: Int,
    val postCaptions: String,
    val postLike: Int,
)