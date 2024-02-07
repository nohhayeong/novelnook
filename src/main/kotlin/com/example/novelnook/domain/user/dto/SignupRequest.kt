package com.example.novelnook.domain.user.dto

data class SignupRequest(
    val nickname:String,
    val password:String,
    val confirmPassword:String
)
