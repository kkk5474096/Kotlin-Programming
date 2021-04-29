package com.example.kotlinprogramming.data

class LocalRepositoryDataSource: RepositoryDataSource {
    override fun fetchRepoData() : List<GithubRepo> {
        return listOf<GithubRepo>(
            GithubRepo(
                name = "android",
                description = "sample project",
                starCount = "5"
            ),
            GithubRepo(
                name = "android",
                description = "sample project",
                starCount = "4"
            ),
            GithubRepo(
                name = "android",
                description = "sample project",
                starCount = "3"
            ),
            GithubRepo(
                name = "android",
                description = "sample project",
                starCount = "2"
            )
        )
    }

    override fun fetchProfileData(): List<ProfileData> {
        return listOf(
            ProfileData(name = "Kang", age = 27),
            ProfileData(name = "kim", age = 25)
        )
    }
}