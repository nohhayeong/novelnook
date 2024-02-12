package com.example.novelnook.domain.user.service

import com.example.novelnook.domain.user.dto.LoginRequest
import com.example.novelnook.domain.user.dto.SignupRequest
import com.example.novelnook.domain.user.dto.UserResponse
import com.example.novelnook.domain.user.model.User
import com.example.novelnook.domain.user.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    fun signup(request: SignupRequest): UserResponse {
//        if (userRepository.existsByNickname(request.nickname)) {
//            throw IllegalStateException("Nickname is already in use")
//        }

        val user = userRepository.save(
            User(
                nickname = request.nickname,
                password = passwordEncoder.encode(request.password)
            )
        )
        return UserResponse(user.nickname)
    }

    fun login(request: LoginRequest): UserResponse {
//        val user = userRepository.findByNickname(request.nickname) ?: throw IllegalArgumentException()
//
//        if (!passwordEncoder.matches(request.password, user.password)) {
//            throw IllegalArgumentException()
//        }
        TODO()

    }
}