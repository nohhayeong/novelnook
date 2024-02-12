package com.example.novelnook.domain.post.service

import com.example.novelnook.domain.comment.repository.CommentRepository
import com.example.novelnook.domain.post.dto.PostRequest
import com.example.novelnook.domain.post.dto.PostResponse
import com.example.novelnook.domain.post.model.Post
import com.example.novelnook.domain.post.model.toResponse
import com.example.novelnook.domain.post.repository.PostRepository
import com.example.novelnook.domain.user.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
    private val commentRepository: CommentRepository,
    private val userRepository: UserRepository
) {
    fun getPostList(): List<PostResponse> {
        return postRepository.findAll().map { it.toResponse() }
    }

    fun getPost(postId: Long): PostResponse {
        // Post 단건 + 댓글 목록까지 반환
        TODO()
    }

    fun createPost(request: PostRequest): PostResponse {
        TODO()
//        postRepository.save(Post(
//            user = ,
//            title = request.title,
//            content = request.content
//        ))
    }

    fun updatePost(postId: Long, request: PostRequest): PostResponse {
        val post = postRepository.findByIdOrNull(postId) ?: throw IllegalArgumentException()

        post.title = request.title
        post.content = request.content

        return postRepository.save(post).toResponse()
    }

    fun deletePost(postId: Long) {
        val post = postRepository.findByIdOrNull(postId) ?: throw IllegalArgumentException()
        postRepository.delete(post)
    }
}


