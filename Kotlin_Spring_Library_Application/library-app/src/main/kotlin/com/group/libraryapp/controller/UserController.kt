package com.group.libraryapp.controller

import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.dto.user.request.UserUpdateRequest
import com.group.libraryapp.dto.user.response.UserResponse
import com.group.libraryapp.service.user.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService,
) {
    @PostMapping("/user")
    fun saveUser(@RequestBody requestBody: UserCreateRequest) {
        userService.saveUser(requestBody)
    }

    @GetMapping("/user")
    fun getUsers():List<UserResponse> = userService.getUsers()


    @PutMapping("/user")
    fun updateUser(@RequestBody requestBody: UserUpdateRequest) {
        userService.updateUserName(requestBody)
    }

    @DeleteMapping("/user")
    fun deleteUser(@RequestParam name: String) {
        userService.deleteUser(name)
    }


}