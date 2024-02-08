package com.example.novelnook.domain.post.service

import com.example.novelnook.domain.post.dto.PostRequest
import com.example.novelnook.domain.post.dto.PostResponse
import org.springframework.stereotype.Service

@Service
class PostService {
    fun getPostList(): List<PostResponse> {
        TODO("Not yet implemented")
    }

    fun getPost(postId: Long): PostResponse {
        TODO("Not yet implemented")
    }

    fun createPost(request: PostRequest): PostResponse {
        TODO("Not yet implemented")
    }

    fun updatePost(postId: Long, request: PostRequest): PostResponse {
        TODO("Not yet implemented")
    }

    fun deletePost(postId: Long) {
        TODO("Not yet implemented")
    }


}