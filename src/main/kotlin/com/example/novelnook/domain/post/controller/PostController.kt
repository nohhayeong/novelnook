package com.example.novelnook.domain.post.controller

import com.example.novelnook.domain.post.dto.PostRequest
import com.example.novelnook.domain.post.dto.PostResponse
import com.example.novelnook.domain.post.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/posts")
@RestController
class PostController(
    private val postService: PostService
) {

    @GetMapping
    fun getPostList() : ResponseEntity<List<PostResponse>>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(postService.getPostList())
    }

    @GetMapping("/{postId}")
    fun getPost(@PathVariable postId:Long) : ResponseEntity<PostResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(postService.getPost(postId))
    }

    @PostMapping
    fun createPost(@RequestBody request: PostRequest) : ResponseEntity<PostResponse>{
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(postService.createPost(request))
    }

    @PutMapping("/{postId}")
    fun updatePost(@PathVariable postId:Long, @RequestBody request:PostRequest) : ResponseEntity<PostResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(postService.updatePost(postId, request))
    }

    @DeleteMapping("/{postId}")
    fun deletePost(@PathVariable postId:Long) : ResponseEntity<Unit>{
        postService.deletePost(postId)

        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .build()
    }
}