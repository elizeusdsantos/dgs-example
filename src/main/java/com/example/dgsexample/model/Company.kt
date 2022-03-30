package com.example.dgsexample.model

data class Company(
    val id: Long,
    val companyName: String,
    val domain: String,
    val yearFounded: Int?
)