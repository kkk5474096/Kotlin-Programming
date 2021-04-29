package com.example.kotlinprogramming.data

interface RepositoryDataSource {
    fun fetchRepoData(): List<GithubRepo>
}