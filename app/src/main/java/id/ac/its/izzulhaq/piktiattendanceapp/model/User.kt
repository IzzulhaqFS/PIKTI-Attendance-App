package id.ac.its.izzulhaq.piktiattendanceapp.model

import id.ac.its.izzulhaq.piktiattendanceapp.Role

data class User(
    val userId: Int,
    val username: String,
    val password: String,
    val role: Role
)
