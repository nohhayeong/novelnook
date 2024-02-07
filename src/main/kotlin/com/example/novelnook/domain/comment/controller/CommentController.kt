package com.example.novelnook.domain.comment.controller

import com.example.novelnook.domain.comment.dto.CommentRequest
import com.example.novelnook.domain.comment.dto.CommentResponse
import com.example.novelnook.domain.comment.service.CommentService
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/posts/{postId}/comments")
@RestController
class CommentController(
    private val commentService: CommentService
) {

    @PostMapping
    fun createComment(@PathVariable postId:Long, @RequestBody request: CommentRequest) : ResponseEntity<CommentResponse>{
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(commentService.createComment(postId, request))
    }

    @PutMapping("/{commentId}")
    fun updateComment(@PathVariable postId: Long, @PathVariable commentId:Long, @RequestBody request:CommentRequest) : ResponseEntity<CommentResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(commentService.updateComment(postId, commentId, request))
    }

    @DeleteMapping("/{commentId}")
    fun deleteComment(@PathVariable postId: Long, @PathVariable commentId: Long) : ResponseEntity<Unit> {
        commentService.deleteComment(postId, commentId)

        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .build()
    }

}