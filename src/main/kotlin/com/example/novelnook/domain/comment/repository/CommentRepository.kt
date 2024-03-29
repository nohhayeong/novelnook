package com.example.novelnook.domain.comment.repository

import com.example.novelnook.domain.comment.model.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<Comment, Long> {
}