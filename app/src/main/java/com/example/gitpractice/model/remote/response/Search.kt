package com.example.gitpractice.model.remote.response

data class Search(
    val Response: String,
    val Search: List<SearchX>,
    val totalResults: String
)