package com.example.novelnook.domain.comment.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "comment")
class Comment (
    @Column
    var content:String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
}