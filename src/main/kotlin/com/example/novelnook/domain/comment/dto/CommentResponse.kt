package com.example.novelnook.domain.comment.dto

import java.time.LocalDateTime

data class CommentResponse(
    val nickname:String,
    val content:String,
    val createAt:LocalDateTime
)
