package com.example.novelnook.domain.user.repository

import com.example.novelnook.domain.user.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    
}