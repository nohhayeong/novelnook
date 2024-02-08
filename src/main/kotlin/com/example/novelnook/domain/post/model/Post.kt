package com.example.novelnook.domain.post.model

import com.example.novelnook.domain.user.model.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "post")
class Post(
    @Column
    var title: String,

    @Column
    var content: String,

    @ManyToOne @JoinColumn(name = "user_id") val user: User
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "created_at", updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
}