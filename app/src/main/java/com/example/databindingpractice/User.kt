package com.example.databindingpractice

data class User(
    val name: String,
    val greeting: String,
    val origin: String,
    val nameList: List<String>?,
    val gender: Boolean
)