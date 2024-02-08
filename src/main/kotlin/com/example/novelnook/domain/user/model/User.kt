package com.example.novelnook.domain.user.model

import jakarta.persistence.*

@Entity
@Table(name = "app_user")
class User (
    @Column
    val nickname: String,

    @Column
    val password:String
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long?=null
}