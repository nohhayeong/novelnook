package com.example.novelnook.domain.post.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "post")
class Post (
    @Column
    var title:String,

    @Column
    var content:String,
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long?=null

    @Column(updatable = false)
    val createdAt:LocalDateTime = LocalDateTime.now()
}