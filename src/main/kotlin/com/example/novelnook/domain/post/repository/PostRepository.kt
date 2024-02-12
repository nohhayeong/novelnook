package com.example.novelnook.domain.post.repository

import com.example.novelnook.domain.post.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
}