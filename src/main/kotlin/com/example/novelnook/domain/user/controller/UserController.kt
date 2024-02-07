package com.example.novelnook.domain.user.controller

import com.example.novelnook.domain.user.dto.LoginRequest
import com.example.novelnook.domain.user.dto.SignupRequest
import com.example.novelnook.domain.user.dto.UserResponse
import com.example.novelnook.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController
class UserController(
    private val userService: UserService
) {

    @PostMapping("/signup")
    fun signup(@RequestBody request: SignupRequest) : ResponseEntity<UserResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(userService.signup(request))
    }

    @PostMapping("/login")
    fun login(@RequestBody request: LoginRequest):ResponseEntity<UserResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(userService.login(request))
    }
}