package com.example.novelnook.domain.post.dto

import java.time.LocalDateTime

data class PostResponse(
    val nickname: String,
    val title: String,
    val content: String,
    val createdAt: LocalDateTime
)