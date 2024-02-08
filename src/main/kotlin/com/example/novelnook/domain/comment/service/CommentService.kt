package com.example.novelnook.domain.comment.service

import com.example.novelnook.domain.comment.dto.CommentRequest
import com.example.novelnook.domain.comment.dto.CommentResponse
import org.springframework.stereotype.Service

@Service
class CommentService {
    fun createComment(postId: Long, request: CommentRequest): CommentResponse {
        TODO("Not yet implemented")
    }

    fun updateComment(postId: Long, commentId: Long, request: CommentRequest): CommentResponse {
        TODO("Not yet implemented")
    }

    fun deleteComment(postId: Long, commentId: Long) {
        TODO("Not yet implemented")
    }
}